package proxy.mySelfJdkProxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MySelfProxy {
    public static Object newProxyInstance(MySelfClassLoader classLoader, Class[] ins, MySelfJdkProxy mySelfJdkProxy) {
        //生成一个代理类的字节码，实现了ins所有的接口
        String name = "myProxy$0";
        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
                name , ins);
        FileOutputStream out =null;

        String path = MySelfClassLoader.class.getResource("").getPath()+name+".class";
      //  String path = "D:\\IdeaProjects\\design-pattern\\proxy\\target\\classes\\proxy\\mySelfJdkProxy\\"+name+".class";
        try {
            out = new FileOutputStream(path);
            out.write(proxyClassFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=out) try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Class proxyClass = null;
        //将这个字节码用类加载器加载到内存中
        try {
            proxyClass = classLoader.findClass("myProxy$0");
            System.out.println(proxyClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //生成这个代理类的对象，返回
        try {
            return proxyClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
