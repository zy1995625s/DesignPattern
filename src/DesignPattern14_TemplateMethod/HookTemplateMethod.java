package DesignPattern14_TemplateMethod;

/**
 * 在模板方法模式中，基本方法包含：抽象方法、具体方法和钩子方法，正确使用“钩子方法”可以使得子类控制父类的行为。
 * @author YidaZhang
 *
 */

public class HookTemplateMethod {
	public static void main(String[] args) {
        HookAbstractClass tm=new HookConcreteClass();
        tm.TemplateMethod();
	}
}

//含钩子方法的抽象类
abstract class HookAbstractClass {
	public void TemplateMethod() {
		abstractMethod1();
		HookMethod1();
		if(HookMethod2()) {
			SpecificMethod();
		}
		abstractMethod2();
	}
	
	public void SpecificMethod() {
		System.out.println("抽象类中的具体方法被调用...");
	}
	
	public void HookMethod1(){}  //钩子方法1
    
	public boolean HookMethod2() //钩子方法2
    {
        return true;
    }
    
	public abstract void abstractMethod1(); //抽象方法1
    
	public abstract void abstractMethod2(); //抽象方法2
}

//含钩子方法的具体子类
class HookConcreteClass extends HookAbstractClass {
    
	public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }   
    
	public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }   
    
	public void HookMethod1() {
        System.out.println("钩子方法1被重写...");
    }
    
	public boolean HookMethod2() {
        return true;
    }
}
