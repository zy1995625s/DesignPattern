package DesignPattern07_Adapter;

interface Target {
	public void request();
}

class Adaptee{
	public void specificRequest() {
		System.out.print("适配者中的业务代码被调用");
	}
}

class Adapter implements Target {
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public void request() {
		adaptee.specificRequest();
	}
}

public class ObjectAdapter {
	public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
	}
	
}
