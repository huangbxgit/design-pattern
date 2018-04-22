package proxy.jdkProxy;

import proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class FatherJdkProxy implements InvocationHandler {

    private Object target;

    public FatherJdkProxy(Object target){
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是父亲jdk动态代理，帮儿子找对象");
        Object obj = method.invoke(target,args);
        System.out.println("成功了");
        return obj;
    }

    public Object getProxyInstance(){
        Class [] ins = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),ins,this);
    }
}
