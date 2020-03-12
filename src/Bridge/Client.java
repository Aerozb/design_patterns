package Bridge;

public class Client  {
    public static void main(String[] args) {
        Phone phone1=new FoldingPhone(new XiaoMi());
        phone1.open();
        phone1.close();
        phone1.callAll();

        Phone phone2=new FullScreenPhone(new XiaoMi());
        phone2.open();
        phone2.close();
        phone2.callAll();
    }
}
