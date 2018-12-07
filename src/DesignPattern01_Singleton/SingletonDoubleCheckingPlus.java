package DesignPattern01_Singleton;

/**
 * 双重检测，但是由于JVM底层实现的问题，还是不稳定
 * @author YidaZhang
 *
 */
public class SingletonDoubleCheckingPlus {
	private static SingletonDoubleCheckingPlus instance;
	
	public static SingletonDoubleCheckingPlus getInstance() {
		if(instance == null) {
			SingletonDoubleCheckingPlus s;
			synchronized(SingletonDoubleCheckingPlus.class) {
				s = instance;
				if(s == null) {
					synchronized(SingletonDoubleCheckingPlus.class) {
						if(s == null) {
							s = new SingletonDoubleCheckingPlus();
						}
					}
					instance = s;
				}
			}
		}
		return instance;
	}
	
	private SingletonDoubleCheckingPlus() {}
}
