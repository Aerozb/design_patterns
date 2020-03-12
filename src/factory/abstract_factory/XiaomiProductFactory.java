package factory.abstract_factory;

/**
 * 小米产品工厂
 */
public class XiaomiProductFactory implements IProductFactory {
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产小米手机");
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println(">>>>>>生产小米路由器");
        return new XiaomiRouter();
    }
}