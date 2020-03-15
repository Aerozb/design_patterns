package Proxy.static_proxy.agent;

import Proxy.static_proxy.man.IManFactory;
import Proxy.static_proxy.woman.IWomanFactory;

/**
 * 代理商
 */
public class LisonCompany implements IManFactory, IWomanFactory {
    private IManFactory manFactory;
    private IWomanFactory womanFactory;

    public void setManFactory(IManFactory manFactory) {
        this.manFactory = manFactory;
    }

    public void setWomanFactory(IWomanFactory womanFactory) {
        this.womanFactory = womanFactory;
    }

    @Override
    public void saleMan(float length) {
        before();
        manFactory.saleMan(length);
        after();
    }

    @Override
    public void saleWoman(int faceSource) {
        before();
        womanFactory.saleWoman(faceSource);
        after();
    }

    public void before() {
        System.out.println("售前服务");
    }

    public void after() {
        System.out.println("售后服务");
    }
}