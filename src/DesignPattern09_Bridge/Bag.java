package DesignPattern09_Bridge;

/**
 * 组合模式能减少类的继承，注意这里的protected修饰符，组合模式四种角色：
 * Abstraction：Bag
 * Implementor：Color
 * Refined Abstraction：HandBag 与 Wellet
 * Concrete Implementor：Yellow 与 Red
 * 
 * Abstraction中含有protected修饰的Implementor，
 * 因为Refined Abstraction要能通过Implementor与Concrete Implementor 联系起来
 * @author YidaZhang
 *
 */
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
