package DesignPattern04_AbstractFactory;

public interface Seat {
	void massage();
}

class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("can massage!");
	}
}
class LowSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("NO massage!");
	}
}
