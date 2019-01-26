package DesignPattern07_Adapter;

interface TargetI {
	public void request();
}

class AdapteeI {
	public void specificRequest() {
		System.out.print("适配者中的业务代码被调用");
	}
}

class AdapterI extends AdapteeI implements TargetI {
	public void request() {
		specificRequest();
	}
}

public class ClassAdapter {
	public static void main(String[] args) {
		System.out.println("类适配器模式测试：");
		TargetI target = new AdapterI();
		target.request();
	}
}