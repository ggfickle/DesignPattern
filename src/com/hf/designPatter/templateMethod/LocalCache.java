package com.hf.designPatter.templateMethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalCache extends AbstractSetting{

    private final Map<String, String> map = new ConcurrentHashMap<>();

    @Override
    protected String getFromCache(String key) {
        System.out.println("get From Local Cache");
        return map.get(key);
    }

    @Override
    protected void setIntoCache(String key, String value) {
        map.put(key, value);
    }
}
