package DesignPattern09_Bridge;

public class Client {
	public static void main(String[] args) {
		ComputerClass c1 = new Desktop(new Dell());
		c1.sell();
	}
}
