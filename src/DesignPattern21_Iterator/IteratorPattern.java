package DesignPattern21_Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 * 
 * 迭代器模式主要包含以下角色。
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 * 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 * 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 * 
 * @author YidaZhang
 *
 */

public class IteratorPattern {
	public static void main(String[] args) {
		Aggregate ag = new ConcreteAggregate();
		ag.add("中山大学");
		ag.add("华南理工");
		ag.add("韶关学院");
		System.out.print("聚合的内容有：");
		Iterator it = ag.getIterator();
		while (it.hasNext()) {
			Object ob = it.next();
			System.out.print(ob.toString() + "\t");
		}
		Object ob = it.first();
		System.out.println("\nFirst：" + ob.toString());
	}
}

//抽象聚合
interface Aggregate {
	public void add(Object obj);

	public void remove(Object obj);

	public Iterator getIterator();
}

//具体聚合
class ConcreteAggregate implements Aggregate {
	private List<Object> list = new ArrayList<Object>();

	public void add(Object obj) {
		list.add(obj);
	}

	public void remove(Object obj) {
		list.remove(obj);
	}

	public Iterator getIterator() {
		return (new ConcreteIterator(list));
	}
}

//抽象迭代器
interface Iterator {
	Object first();

	Object next();

	boolean hasNext();
}

//具体迭代器
class ConcreteIterator implements Iterator {
	private List<Object> list = null;
	private int index = -1;

	public ConcreteIterator(List<Object> list) {
		this.list = list;
	}

	public boolean hasNext() {
		if (index < list.size() - 1) {
			return true;
		} else {
			return false;
		}
	}

	public Object first() {
		index = 0;
		Object obj = list.get(index);
		return obj;
	}

	public Object next() {
		Object obj = null;
		if (this.hasNext()) {
			obj = list.get(++index);
		}
		return obj;
	}
}
