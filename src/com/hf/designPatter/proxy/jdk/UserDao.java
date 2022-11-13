package com.hf.designPatter.proxy.jdk;

public class UserDao implements IUserDao{
    @Override
    public void selectUser() {
        System.out.println("get user success");
    }
}
