package DesignPattern12_Facade;

/**
 * 是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。该模式对外有一个统一接口，
 * 外部应用程序不用关心内部子系统的具体的细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
 * 
 * 外观（Facade）模式包含以下主要角色。
 * 外观（Facade）角色：为多个子系统对外提供一个共同的接口。
 * 子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
 * 客户（Client）角色：通过一个外观角色访问各个子系统的功能。
 * @author YidaZhang
 *
 */

public class FacadePattern {

	public static void main(String[] args) {
        Facade f=new Facade();
        f.method();
	}
}

class Facade {
	private SubSystem01 obj1 = new SubSystem01();
	private SubSystem02 obj2 = new SubSystem02();
	private SubSystem03 obj3 = new SubSystem03();
	
	public void method() {
		obj1.method1();
		obj2.method2();
		obj3.method3();
	}
}

//子系统角色
class SubSystem01
{
  public  void method1()
  {
      System.out.println("子系统01的method1()被调用！");
  }   
}
//子系统角色
class SubSystem02
{
	public  void method2()
	{
		System.out.println("子系统01的method1()被调用！");
	}   
}
//子系统角色
class SubSystem03
{
	public  void method3()
	{
		System.out.println("子系统01的method1()被调用！");
	}   
}

