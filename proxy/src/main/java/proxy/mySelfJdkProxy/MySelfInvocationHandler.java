package proxy.mySelfJdkProxy;

import java.lang.reflect.Method;

public interface  MySelfInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
