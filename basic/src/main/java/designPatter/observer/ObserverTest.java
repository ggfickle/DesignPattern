package designPatter.observer;

import designPatter.observer.javaClass.ObserverForDoubleColor;
import designPatter.observer.javaClass.ObserverForSSQ;
import designPatter.observer.origin.Observer1;
import designPatter.observer.origin.Observer2;
import designPatter.observer.origin.ObserverFor3D;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/23 20:35
 */
public class ObserverTest {

    public static void main(String[] args) {
        originTest();
        javaClassTest();
    }

    public static void originTest() {
        ObserverFor3D observerFor3D = new ObserverFor3D();
        Observer1 observer1 = new Observer1(observerFor3D);
        Observer2 observer2 = new Observer2(observerFor3D);
        observerFor3D.setMsg("3,8,5");
    }

    public static void javaClassTest() {
        ObserverForSSQ observerForSSQ = new ObserverForSSQ();
        ObserverForDoubleColor observerForDoubleColor = new ObserverForDoubleColor();
        designPatter.observer.javaClass.Observer1 observer1 =
                new designPatter.observer.javaClass.Observer1();
        designPatter.observer.javaClass.Observer2 observer2 =
                new designPatter.observer.javaClass.Observer2();
        observer1.registerSubject(observerForSSQ);
        observer1.registerSubject(observerForDoubleColor);
        observer2.registerSubject(observerForSSQ);
        observer2.registerSubject(observerForDoubleColor);

        observerForSSQ.setMsg("1,2,3,4,5,6,7");
        observerForDoubleColor.setMsg("4,3,2,5,7,3,4");
    }
}
