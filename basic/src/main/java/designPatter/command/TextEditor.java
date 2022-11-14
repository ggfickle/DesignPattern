package designPatter.command;

public class TextEditor {

    private StringBuilder buffer = new StringBuilder();

    public void copy() {
        buffer.append(buffer);
    }

    public void paste() {
        System.out.println(buffer);
    }

    public void add(String s) {
        buffer.append(s);
    }

    public void delete() {
        if (buffer.length() > 0) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }

    public String getState() {
        return buffer.toString();
    }
}
