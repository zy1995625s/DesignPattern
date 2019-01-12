package DesignPattern06_ProtoType;
/*
 * 浅复制对象中，均为基本类型，不含有引用类型
 */
class TeacherI implements Cloneable{
    private String name;
    private int age;

    public TeacherI(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 覆盖
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ShadowCloneBasicTypeTest {
	public static void main(String[] args) {
	    TeacherI origin = new TeacherI("tony", 11);
	    System.out.println(origin.getName());
	    TeacherI clone = (TeacherI) origin.clone();
	    clone.setName("clone");
	    System.out.println(origin.getName());
	    System.out.println(clone.getName());
	}
}
