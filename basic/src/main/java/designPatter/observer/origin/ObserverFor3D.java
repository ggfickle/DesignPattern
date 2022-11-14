package designPatter.observer.origin;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author xiehongfei
 * @description
 * @date 2022/10/23 22:04
 */
public class ObserverFor3D implements Subject{

    private List<Observer> observerList = new CopyOnWriteArrayList<>();

    private String msg;

    /**
     * 注册一个观察者
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(observer);
            return;
        }
        throw new RuntimeException("cant find this observer in observers");
    }

    /**
     * 同志所有的观察者
     */
    @Override
    public void notifyObservers() {
        observerList.forEach(item->{
            item.update(msg);
        });
    }

    /**
     * 主题更新消息
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
