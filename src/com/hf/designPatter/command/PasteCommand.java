package com.hf.designPatter.command;

public class PasteCommand implements Command{

    private final TextEditor textEditor;

    public PasteCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.paste();
    }
}
