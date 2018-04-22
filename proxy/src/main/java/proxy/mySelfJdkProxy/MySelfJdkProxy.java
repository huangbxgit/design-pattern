package proxy.mySelfJdkProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MySelfJdkProxy implements  MySelfInvocationHandler{
    private Object target;

    public MySelfJdkProxy(Object target){
        this.target = target;
    }
    public Object getProxyInstance(){
        Class [] ins = target.getClass().getInterfaces();
        MySelfClassLoader classLoader = new MySelfClassLoader();
        return MySelfProxy.newProxyInstance(classLoader,ins,this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是父亲自己实现的jdk动态代理，帮儿子找对象");
        Object obj = method.invoke(target,args);
        System.out.println("成功了");
        return obj;
    }
}
