package Bridge;

public class FullScreenPhone extends Phone {

    public FullScreenPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        brand.open();
        System.out.println("全屏手机");
    }

    @Override
    public void close() {
        brand.close();
        System.out.println("全屏手机");
    }

    @Override
    public void callAll() {
        brand.callAll();
        System.out.println("全屏手机");
    }
}
