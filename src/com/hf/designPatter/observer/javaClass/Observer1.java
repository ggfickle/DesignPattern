package com.hf.designPatter.observer.javaClass;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/23 22:33
 */
public class Observer1 implements Observer {

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ObserverForSSQ) {
            ObserverForSSQ observer = (ObserverForSSQ)o;
            System.out.printf("Observer1 SSQ开奖-%s, 中奖了！%n",observer.getMsg());
        }

        if (o instanceof ObserverForDoubleColor) {
            ObserverForDoubleColor observer = (ObserverForDoubleColor)o;
            System.out.printf("Observer1 DoubleColor开奖-%s, 中奖了！%n",observer.getMsg());
        }
    }
}
