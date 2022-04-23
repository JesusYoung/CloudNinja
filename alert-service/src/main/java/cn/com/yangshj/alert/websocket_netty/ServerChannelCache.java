package cn.com.yangshj.alert.websocket_netty;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import org.springframework.stereotype.Component;

/**
 * Create by yangshj on 4/19/22
 */
@Component
public class ServerChannelCache {

    private static final ConcurrentHashMap<String, HashMap<String, Channel>> CACHE_MAP = new ConcurrentHashMap<>();
    private static final AttributeKey<String> CHANNEL_ATTR_KEY = AttributeKey.valueOf("test");

    public String getCacheId(Channel channel) {
        return channel.attr(CHANNEL_ATTR_KEY).get();
    }

    public void add(String cacheId, Channel channel) {
        channel.attr(CHANNEL_ATTR_KEY).set(cacheId);
        HashMap<String, Channel> hashMap = CACHE_MAP.get(cacheId);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(channel.id().asShortText(), channel);
        CACHE_MAP.put(cacheId, hashMap);
    }

    public HashMap<String, Channel> get(String cacheId) {
        if (cacheId == null) {
            return null;
        }
        return CACHE_MAP.get(cacheId);
    }

    public void remove(Channel channel) {
        String cacheId = getCacheId(channel);
        if (cacheId == null) {
            return;
        }
        HashMap<String, Channel> hashMap = CACHE_MAP.get(cacheId);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.remove(channel.id().asShortText());
        CACHE_MAP.put(cacheId, hashMap);
    }
}
