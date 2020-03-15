package Proxy.static_proxy.test;


import Proxy.static_proxy.agent.LisonCompany;
import Proxy.static_proxy.man.IManFactory;
import Proxy.static_proxy.man.ManFactory;
import Proxy.static_proxy.woman.IWomanFactory;
import Proxy.static_proxy.woman.WomanFactory;

public class Test {
	public static void main(String[] args) {
		// 男性工厂
		IManFactory manFactory = new ManFactory();
		// 女性工厂
		IWomanFactory womanFactory = new WomanFactory();
		// 中间商
		LisonCompany company = new LisonCompany();

		// 中间代理商设置男性工厂
		company.setManFactory(manFactory);
		// 女客户开始购买男性娃娃，由中间商调用代理过后的方法
		company.saleMan(18);

		System.out.println("====================");

		// 中间代理商设置男性工厂
		company.setWomanFactory(womanFactory);
		// 男客户开始购买男性娃娃，由中间商调用代理过后的方法
		company.saleWoman(10);
	}
}
