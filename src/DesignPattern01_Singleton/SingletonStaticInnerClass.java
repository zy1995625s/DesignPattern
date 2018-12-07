package DesignPattern01_Singleton;

/**
 * 静态内部类实现单例模式
 * @author YidaZhang
 *
 */
public class SingletonStaticInnerClass {
	private static class SingletonInstance {
		private static final SingletonStaticInnerClass instance = new SingletonStaticInnerClass();
	}
	
	public static SingletonStaticInnerClass getInstance() {
		return SingletonInstance.instance;
	}
	
	private SingletonStaticInnerClass() {}
}
