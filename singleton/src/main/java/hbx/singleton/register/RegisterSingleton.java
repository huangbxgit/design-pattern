package hbx.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RegisterSingleton {
    private static Map<String, Object> maps = new ConcurrentHashMap<String, Object>();

    private RegisterSingleton() {

    }

    public static Object getInstance(String className) {
        if (className == null || "".equals(className))
            return null;
        if (maps.containsKey(className)) {
            return maps.get(className);
        } else {
            try {
                //线程安全，双重检查，防止多个线程进入此方法会产生多个对象
                //用className作为锁，不同的对象可以同时进入
                synchronized (className){
                    if(maps.containsKey(className)){
                        return maps.get(className);
                    }
                    Class classObj = Class.forName(className);
                    Object obj = classObj.newInstance();
                    maps.put(className, obj);
                    return obj;
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
