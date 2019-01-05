package DesignPattern05_Builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector director = new YidaAirShipDirector(new YidaAirShipBuilder());
		AirShip ship = director.directAirShip();
		
		System.out.println(ship.getEngine());
	}
}
