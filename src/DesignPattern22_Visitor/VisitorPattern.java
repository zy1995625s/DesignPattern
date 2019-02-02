package DesignPattern22_Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 将作用于某种数据结构中的各元素的操作分离出来封装成独立的类，
 * 使其在不改变数据结构的前提下可以添加作用于这些元素的新的操作，
 * 为数据结构中的每个元素提供多种访问方式。它将对数据的操作与数据结构进行分离
 * 
 * 访问者模式包含以下主要角色。
 * 抽象访问者（Visitor）角色：定义一个访问具体元素的接口，为每个具体元素类对应一个访问操作 visit() ，该操作中的参数类型标识了被访问的具体元素。
 * 具体访问者（ConcreteVisitor）角色：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 * 抽象元素（Element）角色：声明一个包含接受操作 accept() 的接口，被接受的访问者对象作为 accept() 方法的参数。
 * 具体元素（ConcreteElement）角色：实现抽象元素角色提供的 accept() 操作，其方法体通常都是 visitor.visit(this) ，另外具体元素中可能还包含本身业务逻辑的相关操作。
 * 对象结构（Object Structure）角色：是一个包含元素角色的容器，提供让访问者对象遍历容器中的所有元素的方法，通常由 List、Set、Map 等聚合类实现。
 * 
 * @author YidaZhang
 *
 */

public class VisitorPattern {
	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		os.add(new ConcreteElementA());
		os.add(new ConcreteElementB());
		Visitor visitor = new ConcreteVisitorA();
		os.accept(visitor);
		System.out.println("------------------------");
		visitor = new ConcreteVisitorB();
		os.accept(visitor);
	}
}

//抽象访问者
interface Visitor {
	void visit(ConcreteElementA element);

	void visit(ConcreteElementB element);
}

//具体访问者A类
class ConcreteVisitorA implements Visitor {
	public void visit(ConcreteElementA element) {
		System.out.println("具体访问者A访问-->" + element.operationA());
	}

	public void visit(ConcreteElementB element) {
		System.out.println("具体访问者A访问-->" + element.operationB());
	}
}

//具体访问者B类
class ConcreteVisitorB implements Visitor {
	public void visit(ConcreteElementA element) {
		System.out.println("具体访问者B访问-->" + element.operationA());
	}

	public void visit(ConcreteElementB element) {
		System.out.println("具体访问者B访问-->" + element.operationB());
	}
}

//抽象元素类
interface Element {
	void accept(Visitor visitor);
}

//具体元素A类
class ConcreteElementA implements Element {
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String operationA() {
		return "具体元素A的操作。";
	}
}

//具体元素B类
class ConcreteElementB implements Element {
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String operationB() {
		return "具体元素B的操作。";
	}
}

//对象结构角色
class ObjectStructure {
	private List<Element> list = new ArrayList<Element>();

	public void accept(Visitor visitor) {
		Iterator<Element> i = list.iterator();
		while (i.hasNext()) {
			((Element) i.next()).accept(visitor);
		}
	}

	public void add(Element element) {
		list.add(element);
	}

	public void remove(Element element) {
		list.remove(element);
	}
}