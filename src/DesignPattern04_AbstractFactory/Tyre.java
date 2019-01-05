package DesignPattern04_AbstractFactory;

public interface Tyre {
	void life();
}

class LuxuryTyre implements Tyre {
	
	@Override
	public void life() {
		System.out.println("life is longger!");
	}
	
}

class LowTyre implements Tyre {
	
	@Override
	public void life() {
		System.out.println("life is shorter!");
	}
	
}


