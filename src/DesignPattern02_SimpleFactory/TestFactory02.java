package DesignPattern02_SimpleFactory;

public class TestFactory02 {
    public static void main(String[] args){
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("奔驰");

        c1.run();
        c2.run();
    }
}
