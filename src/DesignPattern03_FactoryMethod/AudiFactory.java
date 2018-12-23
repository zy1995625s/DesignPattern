package DesignPattern03_FactoryMethod;

public class AudiFactory implements CarFactory {
	@Override
	public Car createCar() {
		return new Audi();
	}
}
