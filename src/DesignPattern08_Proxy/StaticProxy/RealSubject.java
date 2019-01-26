package DesignPattern08_Proxy.StaticProxy;

public class RealSubject implements ISubject {

	@Override
	public void Request() {
		System.out.println("访问真实主题方法...");
	}

}
