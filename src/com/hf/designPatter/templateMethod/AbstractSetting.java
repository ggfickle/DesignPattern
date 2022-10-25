package com.hf.designPatter.templateMethod;

public abstract class AbstractSetting {

    public final String getSetting(String key) {
        String fromCache = this.getFromCache(key);
        if (fromCache != null && !fromCache.equals("")) {
            return fromCache;
        }
        String fromDataBase = this.readFromDatabase(key);
        this.setIntoCache(key, fromDataBase);
        return fromDataBase;
    }

    private String readFromDatabase(String key) {
        System.out.println("get value from database");
        return "newBee" + key;
    }

    protected abstract String getFromCache(String key);

    protected abstract void setIntoCache(String key, String value);
}
