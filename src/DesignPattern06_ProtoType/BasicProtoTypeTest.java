package DesignPattern06_ProtoType;

/*
 * 基础的原型模式测试
 */
public class BasicProtoTypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType obj1=new RealizeType();
        RealizeType obj2=(RealizeType)obj1.clone();
        System.out.println("obj1==obj2?"+(obj1==obj2));
	}
}

//具体原型类
class RealizeType implements Cloneable {
	RealizeType(){
		System.out.println("具体原型创建成功！");
	}
	
	public Object clone() throws CloneNotSupportedException {
		System.out.println("具体原型复制成功！");
		return (RealizeType) super.clone();
	}
}