package com.hf.designPatter.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/26 22:10
 */
public class Student {
    // 持有缓存:
    private static final Map<String, Student> cache = new HashMap<>();

    // 静态工厂方法:
    public static Student create(int id, String name) {
        String key = id + "\n" + name;
        // 先查找缓存:
        Student std = cache.get(key);
        if (std == null) {
            // 未找到,创建新对象:
            System.out.printf("create new Student(%s, %s)%n", id, name);
            std = new Student(id, name);
            // 放入缓存:
            cache.put(key, std);
        } else {
            // 缓存中存在:
            System.out.printf("return cached Student(%s, %s)%n", std.id, std.name);
        }
        return std;
    }

    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
