package DesignPattern01_Singleton;

public class SingletonTest {
	public static void main(String[] args) {
		SingletonHungry sh1 = SingletonHungry.getInstance();
		SingletonHungry sh2 = SingletonHungry.getInstance();
		System.out.println("测试单例模式饿汉模式，运行结果： " + (sh1 == sh2));
		
		SingletonLazy sl1 = SingletonLazy.getInstance();
		SingletonLazy sl2 = SingletonLazy.getInstance();
		System.out.println("测试单例模式懒汉模式，运行结果： " + (sl1 == sl2));
		
		SingletonDoubleChecking sdc1 = SingletonDoubleChecking.getInstance();
		SingletonDoubleChecking sdc2 = SingletonDoubleChecking.getInstance();
		System.out.println("测试单例模式双重检测模式，运行结果： " + (sdc1 == sdc2));
		
		SingletonVolatile sv1 = SingletonVolatile.getInstance();
		SingletonVolatile sv2 = SingletonVolatile.getInstance();
		System.out.println("测试单例模式Volatile关键字，运行结果： " + (sv1 == sv2));
		
		SingletonDoubleCheckingPlus sdcp1 = SingletonDoubleCheckingPlus.getInstance();
		SingletonDoubleCheckingPlus sdcp2 = SingletonDoubleCheckingPlus.getInstance();
		System.out.println("测试单例模式双重检测复杂模式，运行结果： " + (sdcp1 == sdcp2));
		
		SingletonStaticInnerClass ssi1 = SingletonStaticInnerClass.getInstance();
		SingletonStaticInnerClass ssi2 = SingletonStaticInnerClass.getInstance();
		System.out.println("测试单例模式静态内部类模式，运行结果： " + (sdcp1 == sdcp2));
		
		SingletonEnum se1 = SingletonEnum.INSTANCE;
		SingletonEnum se2 = SingletonEnum.INSTANCE;
		System.out.println("测试单例模式枚举模式，运行结果： " + (sdcp1 == sdcp2));
		
	}
}
