package DesignPattern02_SimpleFactory;



public class TestFactory01 {
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Benz();
		
		c1.run();
		c2.run();
	}
}
