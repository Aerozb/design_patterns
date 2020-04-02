package Observer;

import java.util.LinkedList;

/**
 * 天气API，更新时会自动推送新数据给第三方网站
 */
public class WeatherAPI implements Subject {
    //温度
    private float wenDu;
    //湿度
    private float shiDu;
    //气压
    private float qiYa;

    private LinkedList<Observer> list;

    public WeatherAPI() {
        this.list = new LinkedList<Observer>();
    }

    @Override
    public void setData(float wenDu, float shiDu, float qiYa) {
        this.wenDu = wenDu;
        this.shiDu = shiDu;
        this.qiYa = qiYa;
        //通知调用方更新天气数据
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (list.contains(o)) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(wenDu, shiDu, qiYa);
        }
    }
}
