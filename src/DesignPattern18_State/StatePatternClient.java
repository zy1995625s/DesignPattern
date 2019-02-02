package DesignPattern18_State;

/**
 * 对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。
 * 
 * 状态模式包含以下主要角色。
 * 环境（Context）角色：也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 * 具体状态（Concrete State）角色：实现抽象状态所对应的行为。
 * @author YidaZhang
 *
 */

public class StatePatternClient {
	public static void main(String[] args) {
		Context context=new Context();    //创建环境       
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
	}
}

//环境类
class Context {
	private State state;
    //定义环境类的初始状态
    public Context() {
        this.state=new ConcreteStateA();
    }
    //设置新状态
    public void setState(State state) {
        this.state=state;
    }
    //读取状态
    public State getState() {
        return(state);
    }
    //对请求做处理
    public void Handle() {
        state.Handle(this);
    }
}

//抽象状态类
abstract class State {
    public abstract void Handle(Context context);
}

//具体状态A类
class ConcreteStateA extends State {
    public void Handle(Context context) {
    	System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}

//具体状态B类
class ConcreteStateB extends State {
    public void Handle(Context context) {
    	 System.out.println("当前状态是 B.");
         context.setState(new ConcreteStateA());
    }
}