package DesignPattern06_ProtoType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class TeacherIV implements Serializable{
    private String name;
    private int age;
    private StudentIV student;

    public TeacherIV(String name, int age, StudentIV student){
        this.name = name;
        this.age = age;
        this.student = student;
    }
    // 深克隆
    public Object deepClone() throws IOException, ClassNotFoundException {
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
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

    public StudentIV getStudent() {
        return student;
    }

    public void setStudent(StudentIV student) {
        this.student = student;
    }
}

class StudentIV implements Serializable {
    private String name;
    private int age;
    public StudentIV(String name, int age){
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

    
public class DeepCloneSerializable {
    public static void main(String[] args) {
        try {
            StudentIV s = new StudentIV("学生1", 11);
            TeacherIV origin = new TeacherIV("老师原对象", 23, s);
            System.out.println("克隆前的学生姓名：" + origin.getStudent().getName());
            TeacherIV clone = (TeacherIV) origin.deepClone();
            // 更改克隆后的d学生信息 更改了姓名
            clone.getStudent().setName("我是克隆对象更改后的学生2");
            System.out.println("克隆后的学生姓名：" + clone.getStudent().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
