package cn.com.yangshj.alert.websocket;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Create by yangshj on 4/13/22
 */
@Slf4j
@ServerEndpoint(value = "/websocket/{userId}")
@Component
public class WebSocketServer {


    /**
     * 当前连接数
     */
    private static AtomicInteger count = new AtomicInteger(0);

    private static Map<String, WebSocketServer> websocketMap = new ConcurrentHashMap<>();

    private Session session;

    /**
     * 对应的用户ID
     */
    private String userId = "";


    @OnOpen
    public void onOpen(Session session, @PathParam("userId") String userId) {
        try {
            this.session = session;
            this.userId = userId;
            websocketMap.put(userId, this);
            count.getAndIncrement();
            log.info("有新连接，user: " + userId);
        } catch (Exception e) {
            log.info("连接异常： " + e.toString());
        }

    }

    @OnClose
    public void onClose() {
        // 从map中删除
        websocketMap.remove(this.userId);
        // 数量-1
        count.getAndDecrement();
        log.info("有一连接关闭, " + this.userId);
    }

    @OnError
    public void onError(Session session, Throwable error) {
        log.error("发送错误");
        websocketMap.remove(this.userId);
        // 数量-1
        count.getAndDecrement();
    }

    @OnMessage
    public void onMessage(String message) {
        log.info("来自客户端{}的消息:{}", this.userId, message);
    }

    private void sendMessage(String message) {
        this.session.getAsyncRemote().sendText(message);
    }

    /**
     * 向指定用户发送信息
     *
     * @param userId 用户id
     * @param wsInfo 信息
     */
    public static void sendInfo(String userId, String wsInfo) {
        if (websocketMap.containsKey(userId)) {
            websocketMap.get(userId).sendMessage(wsInfo);
        }
    }

    /**
     * 群发消息
     */
    public static void batchSendInfo(String wsInfo, List<String> ids) {
        ids.forEach(userId -> sendInfo(userId, wsInfo));
    }

    /**
     * 群发所有人
     */
    public static void batchSendInfo(String wsInfo) {
        websocketMap.forEach((k, v) -> v.sendMessage(wsInfo));
    }


    private long startFileSize = 0;
    public void sendLog() {


        File logFile = new File("/Users/yangshijie/Teamsun/test" + "/" + "java_logs.log");

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(logFile, "r");

            ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
            exec.scheduleWithFixedDelay(() -> {
                try {
                    randomAccessFile.seek(startFileSize);
                    String tmp = "";
                    while ((tmp = randomAccessFile.readLine()) != null) {
                        System.out.println("读取日志内容==================> " + tmp);
//                        sendInfo(this.userId, tmp);
                        batchSendInfo(tmp);
                    }
                    startFileSize = randomAccessFile.length();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }, 0, 1, TimeUnit.SECONDS);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取当前连接信息
     */
    public static List<String> getIds() {
        return new ArrayList<>(websocketMap.keySet());
    }

    /**
     * 获取当前连接数量
     */
    public static int getUserCount() {
        return count.intValue();
    }
}
