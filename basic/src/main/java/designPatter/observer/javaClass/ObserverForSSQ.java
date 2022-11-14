package designPatter.observer.javaClass;

import java.util.Observable;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/23 22:26
 */
public class ObserverForSSQ extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers(msg);
    }
}
