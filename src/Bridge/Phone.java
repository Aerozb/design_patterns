package Bridge;

public abstract class Phone {
    protected Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public abstract void open();

    public abstract void close();

    public abstract void callAll();
}
