package DesignPattern12_Facade;

/**
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

