package designPatter.observer.javaClass;

import java.util.Observable;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/23 22:26
 */
public class ObserverForDoubleColor extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        // setChanged()方法用来设置一个内部标志位注明数据发生了变化；
        // notifyObservers()方法会去调用观察者对象列表中所有的Observer的update()方法，通知它们数据发生了变化。
        // 只有在setChange()被调用后，notifyObservers()才会去调用update()
        setChanged();
        notifyObservers(msg);
    }
}
