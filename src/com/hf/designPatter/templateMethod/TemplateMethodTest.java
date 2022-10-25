package com.hf.designPatter.templateMethod;

public class TemplateMethodTest {

    /**
     * 模板方法的核心思想是：父类定义骨架，子类实现某些细节。
     * <p>
     * 为了防止子类重写父类的骨架方法，可以在父类中对骨架方法使用final。对于需要子类实现的抽象方法，一般声明为protected，使得这些方法对外部客户端不可见。
     *
     * @param args
     */
    public static void main(String[] args) {
        AbstractSetting redisCache = new RedisCache();
        System.out.println("redisCache.getSetting(\"zhangsan\") = " + redisCache.getSetting("zhangsan"));
        System.out.println("redisCache.getSetting(\"zhangsan\") = " + redisCache.getSetting("zhangsan"));

        AbstractSetting localCache = new RedisCache();
        System.out.println("localCache.getSetting(\"xiexie\") = " + localCache.getSetting("xiexie"));
        System.out.println("localCache.getSetting(\"xiexie\") = " + localCache.getSetting("xiexie"));
    }
}
