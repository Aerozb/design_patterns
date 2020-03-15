package Proxy.dynamic_proxy.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理商
 */
public class LisonCompany implements InvocationHandler {

	// 聚合工厂，客户需要哪个工厂生产的产品就设置哪个工厂
	private Object factory;

	public void setFactory(Object factory) {
		this.factory = factory;
	}

	// 返回一个代理过后的工厂
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object o, Method method, Object[] params) throws Throwable {
		before();
		// 反射调用方法
		Object result = method.invoke(factory, params);
		after();
		return result;
	}

	public void before() {
		System.out.println("售前服务");
	}

	public void after() {
		System.out.println("售后服务");
	}
}
