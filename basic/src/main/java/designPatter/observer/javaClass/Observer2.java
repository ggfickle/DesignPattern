package designPatter.observer.javaClass;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/23 22:33
 */
public class Observer2 implements Observer {

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ObserverForSSQ) {
            ObserverForSSQ observer = (ObserverForSSQ) o;
//            System.out.printf("Observer2 SSQ开奖-%s, 未中奖！%n", observer.getMsg());
            System.out.printf("Observer2 SSQ开奖-%s, 未中奖！%n", arg.toString());
        }

        if (o instanceof ObserverForDoubleColor) {
            ObserverForDoubleColor observer = (ObserverForDoubleColor) o;
//            System.out.printf("Observer2 DoubleColor开奖-%s, 未中奖！%n", observer.getMsg());
            System.out.printf("Observer2 DoubleColor开奖-%s, 未中奖！%n", arg.toString());
        }
    }
}
