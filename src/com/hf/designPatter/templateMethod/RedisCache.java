package com.hf.designPatter.templateMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RedisCache extends AbstractSetting{

    private final Map<String, String> map = new ConcurrentHashMap<>();

    @Override
    protected String getFromCache(String key) {
        String result = map.get(key);
        if (result != null && !result.equals("")) {
            System.out.println("get From Redis Cache");
        }
        return result;
    }

    @Override
    protected void setIntoCache(String key, String value) {
        map.put(key, value);
    }
}
