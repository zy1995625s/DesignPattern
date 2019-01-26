package DesignPattern09_Bridge;

public abstract class Bag {
	protected Color color;
	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract String getName();
}

class HandBag extends Bag {

	@Override
	public String getName() {
		return color.getColor() + "HandBag";
	}
	
}

class Wellet extends Bag {

	@Override
	public String getName() {
		return color.getColor() + "Wellet";
	}
	
}
