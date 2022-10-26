package com.hf.designPatter.state;

import java.util.Scanner;

public class StateTest {

    /**
     * 状态模式
     * @param args
     */
    public static void main(String[] args) {
        BotContext botContext = new BotContext();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String output = botContext.chat(input);
            System.out.println(output.isEmpty() ? "(no reply)" : "< " + output);
        }
    }
}
