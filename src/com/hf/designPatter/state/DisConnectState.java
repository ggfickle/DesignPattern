package com.hf.designPatter.state;

public class DisConnectState implements State{
    @Override
    public String init() {
        return "Bye!";
    }

    @Override
    public String reply(String input) {
        return "";
    }
}
