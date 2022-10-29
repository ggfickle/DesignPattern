package com.hf.designPatter.composite;

import java.util.List;

public interface Node {

    Node add(Node node);

    List<Node> childrenNode();

    String toXml();
}
