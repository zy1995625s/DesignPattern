package DesignPattern06_ProtoType;

/*
 * 通过重写clone的方法实现深拷贝
 */

class StudentIII implements Cloneable {
    private String name;
    private int age;
    public StudentIII(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone()  {
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

class TeacherIII implements Cloneable{
    private String name;
    private int age;
    private StudentIII studentiii;

    public TeacherIII(String name, int age, StudentIII student){
        this.name = name;
        this.age = age;
        this.studentiii = student;
    }
    // 覆盖
    @Override
    public Object clone() {
        TeacherIII t = null;
        try {
            t = (TeacherIII) super.clone();
            t.studentiii = (StudentIII)studentiii.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return t;
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

    public StudentIII getStudent() {
        return studentiii;
    }

    public void setStudent(StudentIII student) {
        this.studentiii = student;
    }
}

public class DeepCloneOverrideClone {
    public static void main(String[] args) {
        StudentIII s = new StudentIII("学生1", 11);
        TeacherIII origin = new TeacherIII("老师原对象", 23, s);
        System.out.println("克隆前的学生姓名：" + origin.getStudent().getName());
        TeacherIII clone = (TeacherIII) origin.clone();
        // 更改克隆后的学生信息 更改了姓名
        clone.getStudent().setName("我是克隆对象更改后的学生2");
        System.out.println("克隆后的学生姓名：" + clone.getStudent().getName());
    }
}
