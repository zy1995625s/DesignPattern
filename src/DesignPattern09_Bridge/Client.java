package DesignPattern09_Bridge;

public class Client {
	public static void main(String[] args) {
		ComputerClass c1 = new Desktop(new Dell());
		c1.sell();
		
		Bag b1 = new HandBag();
		b1.setColor(new Red());
		System.out.println(b1.getName());
	}
}
