package DesignPattern08_Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{

	private Object subject;
	
	public DynamicProxy() {
		super();
	}

	public DynamicProxy(Object subject) {
		super();
		this.subject = subject;
	}


	@Override
	public Object invoke(Object object, Method method, Object[] args) throws Throwable {
		preRequest();
		method.invoke(subject, args);
		postRequest();
		return null;
	}
	
    private void preRequest(){
        System.out.println("访问真实主题之前的预处理。");
    }
    
    private void postRequest(){
        System.out.println("访问真实主题之后的后续处理。");
    }
	
}
