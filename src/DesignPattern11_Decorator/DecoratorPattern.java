package DesignPattern11_Decorator;

/**
 * 指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
 * 
 * 装饰模式主要包含以下角色。
 * 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
 * 具体构件（Concrete Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 * 抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
 * 具体装饰（Concrete Decorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。
 * @author YidaZhang
 *
 */

public class DecoratorPattern {
	public static void main(String[] args) {
		Component p=new ConcreteComponent();
		p.operation();
		System.out.println("---------------------------------");
		Component d=new ConcreteDecorator(p);
		d.operation();
	}
}


// 抽象构件角色
interface Component{
	public void operation();
}

// 具体构建角色
class ConcreteComponent implements Component{

	public ConcreteComponent() {
        System.out.println("创建具体构件角色");       
	}
	
	@Override
	public void operation() {
		System.out.println("调用具体构件角色的方法operation()");
	}
	
}

// 抽象装饰角色
class Decorator implements Component {

	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		component.operation();
	}
}

// 具体装饰角色
class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}
	
	public void operation() {
		super.operation();
		addFunction();
	}

	private void addFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
	}
	
	
}
