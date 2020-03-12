package Adapter;

public class Phone {
    private IVolatege5V iVolatege5V;

    public Phone(IVolatege5V iVolatege5V) {
        this.iVolatege5V = iVolatege5V;
    }

    public void charge() {
        int v = iVolatege5V.output5V();
        if (v == 5) {
            System.out.println("充电成功" + v + "V");
        }else {
            System.out.println("充电失败");
        }
    }
}
