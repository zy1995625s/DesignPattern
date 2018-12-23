package DesignPattern03_FactoryMethod;

public class Client {

	public static void main(String[] args) {
		Car audi = new AudiFactory().createCar();
		audi.run();
		
		Car benz = new BenzFactory().createCar();
		benz.run();	
		
		// 新加BMW的车，只需要添加BMW类实现Car接口，与BMWFactory实现CarFactory接口
		// 符合OCP(Open Close Principle) 开闭原则
		Car bmw = new BMWFactory().createCar();
		bmw.run();
	}
}
