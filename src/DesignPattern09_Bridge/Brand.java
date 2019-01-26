package DesignPattern09_Bridge;

public interface Brand {
	public void getBrand();
}

class Dell implements Brand {

	@Override
	public void getBrand() {
		System.out.println("Thie is Dell...");
	}
	
}

class Hulp implements Brand {

	@Override
	public void getBrand() {
		System.out.println("Thie is Hulp...");
	}
	
}
