package cn.com.yangshj.alert.websocket_netty;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.*;

/**
 * Create by yangshijie on 4/21/22
 */
@RestController
@RequestMapping("/ws2")
public class WsController {

    @Resource
    private NettyServerHandler nettyServerHandler;

    @Resource
    private FileReadWriteUtil fileReadWriteUtil;

    @GetMapping("/push")
    public String pushMessageToWeb(@RequestParam("id") String id, @RequestParam("channelId") String channelId) {
//        nettyServerHandler.send(Cmd.WMESSAGE, id, channelId, "案说法儿童阿尔废弃物阿尔发捱三顶五");
        fileReadWriteUtil.readFiles2("/Users/yangshijie/Teamsun/test", "java_logs.log", id, channelId);
        return "aa";
    }


    @GetMapping("/a")
    public String xx() {
        fileReadWriteUtil.writeFiles("/Users/yangshijie/Teamsun/test", "java_logs.log");
        return "aa";
    }


}
