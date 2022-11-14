package designPatter.composite;


import java.util.List;

public class CommentNode implements Node{

    private String text;

    public CommentNode(String text) {
        this.text = text;
    }

    @Override
    public Node add(Node node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Node> childrenNode() {
        return null;
    }

    @Override
    public String toXml() {
        return "<!-- " + text + " -->";
    }
}
