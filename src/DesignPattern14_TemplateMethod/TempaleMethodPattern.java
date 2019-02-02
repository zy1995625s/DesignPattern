package DesignPattern14_TemplateMethod;

/**
 * 定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，
 * 使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。它是一种类行为型模式。
 * 
 * 
 * (1) 抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。
 * 它由一个模板方法和若干个基本方法构成。这些方法的定义如下。
 * ① 模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。
 * 
 * ② 基本方法：是整个算法中的一个步骤，包含以下几种类型。
 * 抽象方法：在抽象类中申明，由具体子类实现。
 * 具体方法：在抽象类中已经实现，在具体子类中可以继承或重写它
 * 钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。
 * 
 * (2) 具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤。
 * 
 * 
 * @author YidaZhang
 *
 */

public class TempaleMethodPattern {
	public static void main(String[] args) {
        AbstractClass tm=new ConcreteClass();
        tm.TemplateMethod();
	}
}

//抽象类
abstract class AbstractClass {
	//模板方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();          
        abstractMethod2();
    }
    //具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }
    public abstract void abstractMethod1(); //抽象方法1
    public abstract void abstractMethod2(); //抽象方法2
}

//具体子类
class ConcreteClass extends AbstractClass {
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }   
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}