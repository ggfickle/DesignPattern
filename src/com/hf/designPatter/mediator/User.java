package com.hf.designPatter.mediator;

public class User {

    private String username;

    private String message;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
