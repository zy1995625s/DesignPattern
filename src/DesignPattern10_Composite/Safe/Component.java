package DesignPattern10_Composite.Safe;

import java.util.ArrayList;

/**
 * 组合模式的安全模式：Component只定义了Leaf与Composite之间的公共方法
 * Leaf与Composite可以只关心各自特殊的功能部分，
 * 缺点是Client需要知道哪些是Leaf、哪些是Composite，
 * 因为Composite与Leaf中方法不完全一样
 * @author YidaZhang
 *
 */
public interface Component {
	public void operation();
}

class Leaf implements Component {

	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println("Leaf: " + this.name + " is visited!");
	}
	
}

class Composite implements Component {

	private ArrayList<Component> children = new ArrayList<Component>();
	
	public void add(Component c) {
		children.add(c);
	}

	public void remove(Component c) {
		children.remove(c);
	}

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
