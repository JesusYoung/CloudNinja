package cn.com.yangshj.alert.websocket_netty;

import javax.annotation.Resource;
import java.io.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

/**
 * Create by yangshijie on 4/21/22
 */
@Component
public class FileReadWriteUtil {


    @Resource
    private NettyServerHandler nettyServerHandler;

    private long startFileSize = 0;
    public void readFiles2(String path, String fileName, String id, String channelId) {

        File logFile = new File(path + "/" + fileName);

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(logFile, "r");

            ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
            exec.scheduleWithFixedDelay(() -> {
                try {
                    randomAccessFile.seek(startFileSize);
                    String tmp = "";
                    while ((tmp = randomAccessFile.readLine()) != null) {
                        System.out.println("读取日志内容==================> " + tmp);
                        nettyServerHandler.send(Cmd.WMESSAGE, id, channelId, tmp);
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

    public void writeFiles(String path, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(path + "/" + fileName, true);

            fileWriter.write("xxxxxxxxxxxxxxxxxxxxxxxx: xxxxxxadgafasfasaojasj \n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
