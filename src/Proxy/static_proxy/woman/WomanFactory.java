package Proxy.static_proxy.woman;

public class WomanFactory implements IWomanFactory {
	@Override
	public void saleWoman(int faceSource) {
		System.out.println("女性" + faceSource);
	}
}
