package DesignPattern04_AbstractFactory;

public class Client {
	public static void main(String[] args) {
		Engine luxEngine = new LuxuryCarFactory().createEngine();
		Engine lowEngine = new LowCarFactory().createEngine();
		luxEngine.run();
		lowEngine.run();
		
		Seat luxSeat = new LuxuryCarFactory().createSeat();
		Seat lowSeat = new LowCarFactory().createSeat();
		luxSeat.massage();
		lowSeat.massage();
		
		Tyre luxTyre = new LuxuryCarFactory().createTyre();
		Tyre lowTyre = new LowCarFactory().createTyre();
		luxTyre.life();
		lowTyre.life();
	}
}
