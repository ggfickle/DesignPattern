package com.hf.designPatter.mediator;

public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.printf("username:%s, message:%s%n", user.getUsername(), message);
    }
}
