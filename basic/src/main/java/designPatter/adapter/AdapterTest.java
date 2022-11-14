package designPatter.adapter;

import java.util.concurrent.Callable;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/24 22:04
 */
public class AdapterTest {

    /**
     * Adapter模式可以将一个A接口转换为B接口，使得新的对象符合B接口规范。
     * 编写Adapter实际上就是编写一个实现了B接口，并且内部持有A接口的类：
     * <pre>
     * public BAdapter implements B {
     *     private A a;
     *     public BAdapter(A a) {
     *         this.a = a;
     *     }
     *     public void b() {
     *         a.a();
     *     }
     * }
     * </pre>
     * @param args
     */
    public static void main(String[] args) {
        // Thread构造器只能传入Runnable接口,所以此处RunnableAdapter就是一个适配器
        Callable<Long> callable = new Task(10);
        Thread thread = new Thread(new RunnableAdapter(callable));
        thread.start();
    }
}
