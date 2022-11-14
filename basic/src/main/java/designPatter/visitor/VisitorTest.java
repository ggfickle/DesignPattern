package designPatter.visitor;

import java.io.File;

public class VisitorTest {

    /**
     * 访问者模式
     * @param args
     */
    public static void main(String[] args) {
        FileStructure fs = new FileStructure(new File("."));
        fs.handle(new JavaFileVisitor());
    }
}
