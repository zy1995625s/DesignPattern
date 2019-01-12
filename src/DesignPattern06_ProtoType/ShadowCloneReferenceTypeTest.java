package DesignPattern06_ProtoType;

/*
 * 潜复制对象中含有引用类型
 */

class TeacherII implements Cloneable{
    private String name;
    private int age;
    private StudentII studentii;

    public TeacherII(String name, int age, StudentII student){
        this.name = name;
        this.age = age;
        this.studentii = student;
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

    public StudentII getStudent() {
        return studentii;
    }

    public void setStudent(StudentII student) {
        this.studentii = student;
    }
}

class StudentII {
    private String name;
    private int age;
    public StudentII(String name, int age){
        this.name = name;
        this.age = age;
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

public class ShadowCloneReferenceTypeTest {
	public static void main(String[] args) {
        StudentII student = new StudentII("学生1" ,11);
        TeacherII origin = new TeacherII("老师", 11, student);;
        TeacherII clone = (TeacherII) origin.clone();
        System.out.println("比较克隆后的引用对象");
        System.out.println(origin.getStudent().getClass() == clone.getStudent().getClass());
        StudentII student2 = new StudentII("学生2", 12);
        clone.setStudent(student2);
        System.out.println("克隆后，比较克隆对象改变引用");
        System.out.println(origin.getStudent().getClass() == clone.getStudent().getClass());
    }
}
