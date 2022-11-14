package designPatter.command;

import java.util.ArrayList;
import java.util.List;

public class CommandInvoker {
    private List<Command> commandList = new ArrayList<>();

    public void invokerAll() {
        commandList.forEach(Command::execute);
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }
}
