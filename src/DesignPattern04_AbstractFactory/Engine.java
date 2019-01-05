package DesignPattern04_AbstractFactory;

public interface Engine {
	void run();
	void start();
}

class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("run faster!");
	}

	@Override
	public void start() {
		System.out.println("start faster!");
	}
	
}

class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("run slower!");
	}

	@Override
	public void start() {
		System.out.println("start slower!");
	}
	
}

