package DesignPattern05_Builder;

public interface AirShipBuilder {
	OrbitalModule buildOrbitalModule();
	EscapeTower buildEscaperTower();
	Engine buildEngine();
}
