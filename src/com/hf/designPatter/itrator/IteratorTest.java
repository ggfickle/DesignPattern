package com.hf.designPatter.itrator;

public class IteratorTest {

    /**
     * 迭代器模式
     * @param args
     */
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator<Object> iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
