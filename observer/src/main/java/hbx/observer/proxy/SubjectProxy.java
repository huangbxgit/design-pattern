package hbx.observer.proxy;

import hbx.observer.code.EventLisenter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SubjectProxy extends EventLisenter implements InvocationHandler {

    private Object target;

    public SubjectProxy(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始操作");
        Object ret = method.invoke(target,args);
        System.out.println("动态代理结束操作");
        return ret;
    }

    public Object getProxyInstance(){
        Class [] interfaces = target.getClass().getInterfaces();
       return Proxy.newProxyInstance(target.getClass().getClassLoader(),
               interfaces,this);
    }
}
