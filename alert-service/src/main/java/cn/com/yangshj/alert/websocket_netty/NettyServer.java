package cn.com.yangshj.alert.websocket_netty;

import javax.annotation.Resource;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Create by yangshj on 4/19/22
 */
@Slf4j
@Component
public class NettyServer {


    @Value("${server.netty.port}")
    private int port;

    @Resource
    private ServerNettyInitializer serverNettyInitializer;


    @Bean
    ApplicationRunner nettyRunner() {
        return args -> {
            // new一个主线程组
            EventLoopGroup bossGroup = new NioEventLoopGroup(1);
            // new一个工作线程组
            EventLoopGroup workGroup = new NioEventLoopGroup();
            ServerBootstrap bootstrap = new ServerBootstrap()
                    .group(bossGroup, workGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(serverNettyInitializer)
                    // 设置队列大小
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    // 两小时内没有数据通信时，TCP会自动发送一个活动探测数据报文
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            // 绑定端口，开始接受进来的连接
            try {
                ChannelFuture future = bootstrap.bind(port).sync();
                log.info("服务器启动开始监听端口：{}", port);
                future.channel().closeFuture().sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 关闭主线程组
                bossGroup.shutdownGracefully();
                // 关闭工作线程组
                workGroup.shutdownGracefully();
            }
        };
    }
}
