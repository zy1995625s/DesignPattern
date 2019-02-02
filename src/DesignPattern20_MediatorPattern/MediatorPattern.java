package DesignPattern20_MediatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，
 * 且可以独立地改变它们之间的交互。中介者模式又叫调停模式，它是迪米特法则的典型应用。
 * 
 * 中介者模式包含以下主要角色。
 * 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 * 具体中介者（ConcreteMediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 * 抽象同事类（Colleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 * 具体同事类（Concrete Colleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 * 
 * @author YidaZhang
 *
 */

public class MediatorPattern {
	public static void main(String[] args) {
		Mediator md = new ConcreteMediator();
		Colleague c1, c2;
		c1 = new ConcreteColleague1();
		c2 = new ConcreteColleague2();
		md.register(c1);
		md.register(c2);
		c1.send();
		System.out.println("-------------");
		c2.send();
	}
}

//抽象中介者
abstract class Mediator {
	public abstract void register(Colleague colleague);

	public abstract void relay(Colleague cl); // 转发
}

//具体中介者
class ConcreteMediator extends Mediator {
	private List<Colleague> colleagues = new ArrayList<Colleague>();

	public void register(Colleague colleague) {
		if (!colleagues.contains(colleague)) {
			colleagues.add(colleague);
			colleague.setMedium(this);
		}
	}

	public void relay(Colleague cl) {
		for (Colleague ob : colleagues) {
			if (!ob.equals(cl)) {
				((Colleague) ob).receive();
			}
		}
	}
}

//抽象同事类
abstract class Colleague {
	protected Mediator mediator;

	public void setMedium(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void receive();

	public abstract void send();
}

//具体同事类
class ConcreteColleague1 extends Colleague {
	public void receive() {
		System.out.println("具体同事类1收到请求。");
	}

	public void send() {
		System.out.println("具体同事类1发出请求。");
		mediator.relay(this); // 请中介者转发
	}
}

//具体同事类
class ConcreteColleague2 extends Colleague {
	public void receive() {
		System.out.println("具体同事类2收到请求。");
	}

	public void send() {
		System.out.println("具体同事类2发出请求。");
		mediator.relay(this); // 请中介者转发
	}
}