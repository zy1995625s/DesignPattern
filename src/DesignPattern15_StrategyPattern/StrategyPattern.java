package DesignPattern15_StrategyPattern;

/**
 * 策略模式的主要角色如下。
 * 抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 * @author YidaZhang
 *
 */

public class StrategyPattern {
	public static void main(String[] args) {
        Context c=new Context();
        Strategy s=new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s=new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
	}
}

//抽象策略类
interface Strategy {
	public void strategyMethod();    //策略方法
}

//具体策略类A
class ConcreteStrategyA implements Strategy {
	@Override
	public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
	}
}

//具体策略类B
class ConcreteStrategyB implements Strategy {
	@Override
	public void strategyMethod() {
	      System.out.println("具体策略B的策略方法被访问！");
	}
}

//环境类
class Context {
	private Strategy strategy;
	
	public Strategy getStrategy() {
        return strategy;
	}
	
	public void setStrategy(Strategy strategy) {
        this.strategy=strategy;
    }
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
