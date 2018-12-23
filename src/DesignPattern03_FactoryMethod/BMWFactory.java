package DesignPattern03_FactoryMethod;

public class BMWFactory implements CarFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BMW();
	}

}
