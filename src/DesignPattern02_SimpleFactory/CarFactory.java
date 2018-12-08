package DesignPattern02_SimpleFactory;

public class CarFactory {
    public static Car createCar(String type){
        if("奥迪".equals(type)) {
            return new Audi();
        } else if("奔驰".equals(type)){
            return new Benz();
        } else {
            return null;
        }
    }
}
