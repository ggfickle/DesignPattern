package designPatter.state;

public class BotContext {

    private State state = new DisConnectState();

    public String chat(String input) {
        if ("hello".equals(input)) {
            state = new ConnectState();
            return state.init();
        } else if ("bye".equals(input)) {
            state  = new DisConnectState();
            return state.init();
        }
        return state.reply(input);
    }
}
