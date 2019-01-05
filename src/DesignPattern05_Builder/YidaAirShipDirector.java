package DesignPattern05_Builder;

public class YidaAirShipDirector implements AirShipDirector{

	private AirShipBuilder builder;
	
	public YidaAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public AirShip directAirShip() {
		OrbitalModule orbitalModule = builder.buildOrbitalModule();
		Engine engine = builder.buildEngine();
		EscapeTower escapeTower = builder.buildEscaperTower();
		
		AirShip ship = new AirShip();
		ship.setEngine(engine);
		ship.setEscapeTower(escapeTower);
		ship.setOrbitalModule(orbitalModule);
		
		return ship;
	}

}
