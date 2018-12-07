package DesignPattern01_Singleton;

/**
 * 双重检测，添加volatile关键字，一定程度上能解决JVM指令重排问题
 * @author YidaZhang
 *
 */
public class SingletonVolatile {
	private static volatile SingletonVolatile instance;
	
	public static SingletonVolatile getInstance() {
		if(instance == null) {
			synchronized(SingletonVolatile.class) {
				if(instance == null) {
					instance = new SingletonVolatile();
				}
			}
		}
		return instance;
	}
	
	private SingletonVolatile() {}
}
