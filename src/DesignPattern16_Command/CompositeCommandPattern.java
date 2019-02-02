package DesignPattern16_Command;

import java.util.ArrayList;

/**
 * 将命令模式与前面学的组合模式联合使用，这就构成了宏命令模式，也叫组合命令模式。
 * 宏命令包含了一组命令，它充当了具体命令与调用者的双重角色，执行它时将递归调用它所包含的所有命令
 * @author YidaZhang
 *
 */

public class CompositeCommandPattern {
	public static void main(String[] args) {
		AbstractCommand cmd1=new ConcreteCommand1();
        AbstractCommand cmd2=new ConcreteCommand2();
        CompositeInvoker ir=new CompositeInvoker();
        ir.add(cmd1);
        ir.add(cmd2);
        System.out.println("客户访问调用者的execute()方法...");
        ir.execute();
	}
}

//抽象命令
interface AbstractCommand {
    public abstract void execute();
}

//树叶构件: 具体命令1
class ConcreteCommand1 implements AbstractCommand {
	private CompositeReceiver receiver;
	
	ConcreteCommand1() {
		receiver = new CompositeReceiver();
	}
	
	public void execute() {
		receiver.action1();
	}
}

//树叶构件: 具体命令2
class ConcreteCommand2 implements AbstractCommand {
	private CompositeReceiver receiver;
	
	ConcreteCommand2() {
        receiver=new CompositeReceiver();
	}
	
	public void execute() {
		receiver.action2();
	}
}

//树枝构件: 调用者
class CompositeInvoker implements AbstractCommand {
    private ArrayList<AbstractCommand> children = new ArrayList<AbstractCommand>();   
    
    public void add(AbstractCommand c) {
    	children.add(c);
    }
    
    public void remove(AbstractCommand c) {
    	children.remove(c);
    }
    
    public AbstractCommand getChild(int i) {
        return children.get(i);
    }   
    public void execute() {
        for(Object obj:children)
        {
            ((AbstractCommand)obj).execute();
        }
    }
}

//接收者
class CompositeReceiver {
    public void action1() {
        System.out.println("接收者的action1()方法被调用...");
    }
    
    public void action2() {
        System.out.println("接收者的action2()方法被调用...");
    }
}