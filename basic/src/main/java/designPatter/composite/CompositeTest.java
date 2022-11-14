package designPatter.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Node schoolNode  = new ElementNode("school");
        ElementNode class1 = new ElementNode("class1");
        class1.add(new CommentNode("student1"));
        class1.add(new CommentNode("student2"));
        ElementNode class2 = new ElementNode("class2");
        class2.add(new CommentNode("student3"));
        class2.add(new CommentNode("student4"));
        schoolNode.add(class1).add(class2);
        System.out.println("schoolNode.toXml() = " + schoolNode.toXml());
    }
}
