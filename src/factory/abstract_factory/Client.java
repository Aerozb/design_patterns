package factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        System.out.println("===================小米系列产品=================");
        //小米工厂
        IProductFactory miProduct=new XiaomiProductFactory();
        IPhoneProduct miPhoneProduct = miProduct.produceTelPhone();
        miPhoneProduct.start();
        miPhoneProduct.callUp();
        miPhoneProduct.sendSMS();
        miPhoneProduct.shutdown();
        IRouterProduct miRouterProduct = miProduct.produceRouter();
        miRouterProduct.start();
        miRouterProduct.openWifi();
        miRouterProduct.setting();
        miRouterProduct.shutdown();
        System.out.println("===================华为系列产品=================");
        //华为产品工厂实例
        IProductFactory huaweiProductFactory = new HuaweiProductFactory();
        //生产华为路由器
        IRouterProduct huaweiRouter = huaweiProductFactory.produceRouter();
        huaweiRouter.start();
        huaweiRouter.setting();
        huaweiRouter.openWifi();
        huaweiRouter.shutdown();
        //生产华为手机
        IPhoneProduct huaweiPhone = huaweiProductFactory.produceTelPhone();
        huaweiPhone.start();
        huaweiPhone.callUp();
        huaweiPhone.sendSMS();
        huaweiPhone.shutdown();
    }
}
