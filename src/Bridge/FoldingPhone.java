package Bridge;

public class FoldingPhone extends Phone {

    public FoldingPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        brand.open();
        System.out.println("折叠手机");
    }

    @Override
    public void close() {
        brand.close();
        System.out.println("折叠手机");
    }

    @Override
    public void callAll() {
        brand.callAll();
        System.out.println("折叠手机");
    }
}
