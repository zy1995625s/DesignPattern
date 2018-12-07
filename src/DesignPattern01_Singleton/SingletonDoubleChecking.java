package DesignPattern01_Singleton;

/**
 * 双重检测，但是有漏洞，主要是由于JVM指令重排序引起的
 * @author YidaZhang
 *
 */
public class SingletonDoubleChecking {
	private static SingletonDoubleChecking instance;
	
	public static SingletonDoubleChecking getInstance() {
		if(instance == null) {
			synchronized(SingletonDoubleChecking.class) {
				if(instance == null) {
					instance = new SingletonDoubleChecking();
				}
			}
		}
		return instance;
	}
	
	private SingletonDoubleChecking() {}
}
