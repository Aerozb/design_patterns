package factory.abstract_factory;

/**
 * 华为产品工厂
 */
public class HuaweiProductFactory implements IProductFactory{
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产华为手机");
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println(">>>>>>生产华为路由器");
        return new HuaweiRouter();
    }
}