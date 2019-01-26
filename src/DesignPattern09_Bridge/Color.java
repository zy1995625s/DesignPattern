package DesignPattern09_Bridge;

public interface Color {
	String getColor();
}


class Yellow implements Color{

	@Override
	public String getColor() {
		return "yellow";
	}
	
}

class Red implements Color{

	@Override
	public String getColor() {
		return "red";
	}
	
}