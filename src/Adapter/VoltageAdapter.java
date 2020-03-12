package Adapter;

public class VoltageAdapter implements IVolatege5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int v = 0;
        if (null != voltage220V) {
            v = voltage220V.output();
            v = v / 44;
            System.out.println(v + "V");
        }
        return v;
    }
}
