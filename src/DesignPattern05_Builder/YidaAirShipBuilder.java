package DesignPattern05_Builder;

public class YidaAirShipBuilder implements AirShipBuilder {

	@Override
	public OrbitalModule buildOrbitalModule() {
		System.out.println("Building Yida's OrbitalModule...");
		return new OrbitalModule("Yida");
	}

	@Override
	public EscapeTower buildEscaperTower() {
		System.out.println("Building Yida's EscaperTower...");
		return new EscapeTower("Yida");
	}

	@Override
	public Engine buildEngine() {
		System.out.println("Building Yida's Engine...");
		return new Engine("Yida");
	}
	
}
