package DesignPattern09_Bridge;

abstract class ComputerClass {
	protected Brand brand;
	
	protected ComputerClass(Brand brand) {
		this.brand = brand;
	}
	
	public abstract void sell();
}

class Desktop extends ComputerClass{

	protected Desktop(Brand brand) {
		super(brand);
	}

	@Override
	public void sell() {
		brand.getBrand();
		System.out.println("This a Desktop");
	}
	
}

class Laptop extends ComputerClass{

	protected Laptop(Brand brand) {
		super(brand);
	}

	@Override
	public void sell() {
		brand.getBrand();
		System.out.println("This a Laptop");
	}
	
}