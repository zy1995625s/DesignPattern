package DesignPattern08_Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
    	ISubject temp = new RealSubject();
        InvocationHandler handler = new DynamicProxy(temp);
        
        ISubject subject = (ISubject) Proxy.newProxyInstance(
        		handler.getClass().getClassLoader(),
        		temp.getClass().getInterfaces(), 
        		handler
        		);
        
        subject.Request();
        
    }
}
