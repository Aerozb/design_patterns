package Observer;

/**
 *订阅者（观察者）抽象类，自动接受输入
 */
public abstract class Observer {

    //温度
    protected float wenDu;
    //湿度
    protected float shiDu;
    //气压
    protected float qiYa;

    /**
     * 更新网站显示的天气数据
     */
    public  void update(float wenDu, float shiDu, float qiYa) {
        this.wenDu = wenDu;
        this.shiDu = shiDu;
        this.qiYa = qiYa;
        display();
    }

    public void display() {
        System.out.println("温度"+wenDu);
        System.out.println("湿度"+shiDu);
        System.out.println("气压"+qiYa);
    }
}
