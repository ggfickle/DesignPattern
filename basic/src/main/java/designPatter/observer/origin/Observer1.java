package designPatter.observer.origin;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/23 22:12
 */
public class Observer1 implements Observer{

    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    /**
     * 主题被改变时调用此方法
     *
     * @param msg
     */
    @Override
    public void update(String msg) {
        System.out.printf("Observer1收到了今天的3D开奖号码-%s,今天没中奖。%n", msg);
    }
}
