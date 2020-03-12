package Bridge;

public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("打开小米手机");
    }

    @Override
    public void close() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callAll() {
        System.out.println("小米手机打给所有人");
    }
}
