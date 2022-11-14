package designPatter.command;

public class AddCommand implements Command{
    private final TextEditor textEditor;

    private final String text;

    public AddCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.add(text);
    }
}
