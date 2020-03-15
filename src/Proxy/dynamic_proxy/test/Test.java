package Proxy.dynamic_proxy.test;

import Proxy.dynamic_proxy.agent.LisonCompany;
import Proxy.dynamic_proxy.man.IManFactory;
import Proxy.dynamic_proxy.man.ManFactory;
import Proxy.dynamic_proxy.woman.IWomanFactory;
import Proxy.dynamic_proxy.woman.WomanFactory;

public class Test {
	public static void main(String[] args) {
		// 男性工厂
		IManFactory manFactory = new ManFactory();
		// 女性工厂
		IWomanFactory womanFactory = new WomanFactory();
		// 中间商
		LisonCompany company = new LisonCompany();

		// 中间代理商设置男性工厂
		company.setFactory(manFactory);
		// 生成代理对象，代理商可在买卖前后做一些操作
		IManFactory manFactoryProxy = (IManFactory) company.getProxyInstance();
		//  女客户开始购买男性娃娃，从代码来看，似乎是客户直接向工厂够买，其实是由中间商调用代理过后的方法。
		manFactoryProxy.saleMan(80);

		System.out.println("====================");

		// 中间代理商设置女性工厂
		company.setFactory(womanFactory);
		// 生成代理对象，代理商可在买卖前后做一些操作
		IWomanFactory womanFactoryProxy = (IWomanFactory) company.getProxyInstance();
		// 调用代理过后的方法
		womanFactoryProxy.saleWoman(6);
	}
}
