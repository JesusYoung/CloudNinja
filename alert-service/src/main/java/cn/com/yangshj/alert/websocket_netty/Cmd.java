package cn.com.yangshj.alert.websocket_netty;

/**
 * Create by yangshijie on 4/19/22
 */
public enum Cmd {


    START("000", "連接成功"),
    WMESSAGE("001", "消息提醒"),
    DOWN_START("002", "DOWN_START"),
    ;

    private String cmd;
    private String desc;

    Cmd(String cmd, String desc) {
        this.cmd = cmd;
        this.desc = desc;
    }

    public String getCmd() {
        return cmd;
    }

    public String getDesc() {
        return desc;
    }
}
