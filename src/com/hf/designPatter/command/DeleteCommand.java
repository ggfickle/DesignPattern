package com.hf.designPatter.command;

public class DeleteCommand implements Command{
    private final TextEditor textEditor;

    public DeleteCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.delete();
    }
}
