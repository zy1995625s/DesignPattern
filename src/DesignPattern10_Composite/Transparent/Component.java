package DesignPattern10_Composite.Transparent;

import java.util.ArrayList;


/**
 * 组合模式的透明模式，由三部分组成：Component, Leaf, Composite
 * 透明模式中，Component作为接口定义了所有方法，所以Leaf与Composite都会实现
 * 由于Leaf没有后继Component对象，Component的一些方法Leaf需要特殊处理
 * 好处是Client可以不用了解Leaf与Composite之间的区别，之间Component接口调用即可
 * @author YidaZhang
 *
 */
public interface Component {
	public void add(Component c);
	public void remove(Component c);
	public Component getChild(int i);
	public void operation();
}

class Leaf implements Component {

	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void add(Component c) {}

	@Override
	public void remove(Component c) {}

	@Override
	public Component getChild(int i) {
		return null;
	}

	@Override
	public void operation() {
		System.out.println("Leaf: " + this.name + " is visited!");
	}
	
}

class Composite implements Component {

	private ArrayList<Component> children = new ArrayList<Component>();
	
	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public Component getChild(int i) {
		return children.get(i);
	}

	@Override
	public void operation() {
		for(Object obj : children) {
			((Component)obj).operation();
		}
	}
	
}
