package cn.com.yangshj.alert.websocket_netty;

import javax.annotation.Resource;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import liquibase.pro.packaged.C;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Create by yangshj on 4/19/22
 */
@Slf4j
@Component
public class NettyServerHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    @Resource
    private ServerChannelCache cache;
    private static final String dataKey = "test=";

    @Data
    public static class ChannelCache {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        log.info("通道连接已打开，ID->{}........", channel.id().asShortText());
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof WebSocketServerProtocolHandler.HandshakeComplete) {
            Channel channel = ctx.channel();
            WebSocketServerProtocolHandler.HandshakeComplete handshakeComplete = (WebSocketServerProtocolHandler.HandshakeComplete) evt;
            String requestUri = handshakeComplete.requestUri();
            requestUri = URLDecoder.decode(requestUri, "UTF-8");
            log.info("HANDSHAKE_COMPLETE，ID->{}, URI-{}", channel.id().asLongText(), requestUri);
            String socketKey = requestUri.substring(requestUri.lastIndexOf(dataKey) + dataKey.length());
            log.info("socketKey: {}", socketKey);
            if (socketKey.length() > 0) {
                cache.add(socketKey, channel);
                this.send(channel, Cmd.DOWN_START, "aaa");
            } else {
                channel.disconnect();
                ctx.close();
            }
        }
        super.userEventTriggered(ctx, evt);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        log.error("通道连接已断开，ID->{}, 用户ID->{}", channel.id().asLongText(), cache.getCacheId(channel));
        cache.remove(channel);
    }

    /**
     * 发生异常触发
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        Channel channel = ctx.channel();
        log.error("连接出现异常，ID->{}, 用户ID->{}, 异常->{}", channel.id().asLongText(), cache.getCacheId(channel), cause.getMessage(), cause);
        cache.remove(channel);
        ctx.close();
    }

    /**
     * 客户端发消息会触发
     */
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame textWebSocketFrame) throws Exception {
//        String msg = JsonUtil.toString(Collections.singletonMap("cmd", "100"));
        String msg = "asdasda阿萨斯大所大所大";
        try {
            channelHandlerContext.writeAndFlush(new TextWebSocketFrame(msg));
        } catch (Exception e) {
            log.error("消息处理异常：{}", e.getMessage(), e);
        }
    }

    public void send(Cmd cmd, String id, Object object) {
        HashMap<String, Channel> channels = cache.get(id);
        if (channels == null) {
            return;
        }
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("cmd", cmd.getCmd());
        data.put("data", object);
//        String message = JsonUtil.toString(data);
        String message = data.toString();
        log.info("服务器发消息：{}", message);
        channels.values().forEach(channel -> channel.writeAndFlush(new TextWebSocketFrame(message)));
    }

    public void send(Channel channel, Cmd cmd, Object object) {
        Map<String, Object> data = new LinkedHashMap<>();
        data.put("cmd", cmd.getCmd());
        data.put("data", object);
//        String message = JsonUtil.toString(data);
        String message = data.toString();
        log.info("服务器发消息：{}", message);
        channel.writeAndFlush(new TextWebSocketFrame(message));
    }

    public void send(Cmd cmd, String id, String channelId, Object object) {
        HashMap<String, Channel> channels = cache.get(id);
        if (channels == null) {
            return;
        }
        Channel channel = channels.get(channelId);
        if (channel == null) {
            log.info("channel == null");
            return;
        }
        send(channel, cmd, object);
    }
}
