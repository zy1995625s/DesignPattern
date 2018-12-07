package DesignPattern01_Singleton;

/**
 * 单例模式：懒汉模式
 * @author YidaZhang
 *
 */
public class SingletonLazy {
	private static SingletonLazy instance;
	
	public static synchronized SingletonLazy getInstance() {
		if(instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
	
	private SingletonLazy() {}
}
