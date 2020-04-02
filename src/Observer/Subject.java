package Observer;

/**
 * 发布者接口
 */
public interface Subject {

    /**
     * 设置数据
     */
    public void setData(float wenDu, float shiDu, float qiYa);

    /**
     * 增加一个调用API的人
     */
    public void registerObserver(Observer o);

    /**
     * 移除一个调用API的人
     */
    public void removeObserver(Observer o);

    /**
     * 通知调用API的人
     */
    public void notifyObservers();
}
