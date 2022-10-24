package com.hf.designPatter.command;

public class CommandTest {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.add("Hello world");
        Command copyCommand = new CopyCommand(textEditor);
        Command pasteCommand = new PasteCommand(textEditor);

        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.addCommand(copyCommand);
        commandInvoker.addCommand(copyCommand);
        commandInvoker.addCommand(copyCommand);
        commandInvoker.addCommand(pasteCommand);
        commandInvoker.invokerAll();
    }
}
