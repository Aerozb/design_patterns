package Proxy.static_proxy.man;

public class ManFactory implements IManFactory {
	@Override
	public void saleMan(float length) {
		System.out.println("男性" + length);
	}
}
