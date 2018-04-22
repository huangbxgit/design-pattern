package proxy.cglibProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.Person;

import java.lang.reflect.Method;

public class FatherCglibProxy implements MethodInterceptor {
    private Class fclass;
    public FatherCglibProxy(Class fclass){
        this.fclass = fclass;
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是父亲cglib动态代理，帮儿子找对象");
        Object obj = methodProxy.invokeSuper(o,objects);
        System.out.println("成功了");
        return obj;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        //继承被代理类
        enhancer.setSuperclass(fclass);
        //设置回调
        enhancer.setCallback(this);
        //生成代理类对象
        return enhancer.create();
    }
}
