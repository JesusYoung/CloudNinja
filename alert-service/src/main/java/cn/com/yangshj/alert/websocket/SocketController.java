package cn.com.yangshj.alert.websocket;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Create by yangshj on 4/13/22
 */
@RestController
@RequestMapping("/ws")
public class SocketController {

    @Resource
    private WebSocketServer webSocketServer;


    @Resource
    private FileReadWriteUtils fileReadWriteUtils;

    @GetMapping("/push/{msg}")
    public ResponseEntity<String> pushMessageToWeb(@PathVariable(name = "msg") String msg) {
//        WebSocketServer.batchSendInfo(msg);
        webSocketServer.sendLog();
        return ResponseEntity.ok(msg);
    }


    @PostMapping("/add")
    public String putLog() {
        fileReadWriteUtils.writeFiles("/Users/yangshijie/Teamsun/test", "java_logs.log");
        return "aa";
    }
}
