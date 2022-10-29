package com.hf.designPatter.composite;

import java.util.List;

public class TextNode implements Node{
    private String text;

    public TextNode(String text) {
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
        return text;
    }
}
