package DesignPattern01_Singleton;

/**
 * 单例模式：饱汉模式
 * @author YidaZhang
 *
 */
public class SingletonHungry {
	private static final SingletonHungry instance = new SingletonHungry();
	public static SingletonHungry getInstance() {
		return instance;
	}
	private SingletonHungry() {};
}
