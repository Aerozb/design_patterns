package Adapter;

public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter=new VoltageAdapter(new Voltage220V());
        Phone phone=new Phone(voltageAdapter);
        phone.charge();
    }
}
