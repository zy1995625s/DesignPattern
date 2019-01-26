package DesignPattern08_Proxy.StaticProxy;

public class Proxy {
	private RealSubject realSubject;
    public void Request()
    {
        if (realSubject==null)
        {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
    }
    
    private void preRequest(){
        System.out.println("访问真实主题之前的预处理。");
    }
    
    private void postRequest(){
        System.out.println("访问真实主题之后的后续处理。");
    }
}
