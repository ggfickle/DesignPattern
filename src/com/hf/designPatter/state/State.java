package com.hf.designPatter.state;

public interface State {

    String init();

    String reply(String input);
}
