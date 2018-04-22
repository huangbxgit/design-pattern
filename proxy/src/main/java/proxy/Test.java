package proxy;

import proxy.cglibProxy.FatherCglibProxy;
import proxy.jdkProxy.FatherJdkProxy;
import proxy.mySelfJdkProxy.MySelfJdkProxy;
import proxy.staticProxy.proxy.Fathar;

public class Test {
    public static void main(String[] args) {
        Person son = new Son();
        Fathar fathar = new Fathar(son);
        fathar.findPerson();

        FatherJdkProxy jdkProxy = new FatherJdkProxy(son);
        Person jdkFather = (Person) jdkProxy.getProxyInstance();
        jdkFather.findPerson();

        FatherCglibProxy cglibProxy = new FatherCglibProxy(Son.class);
        Son cglibFather = (Son)cglibProxy.getProxyInstance();
        cglibFather.findPerson();

        MySelfJdkProxy myJdkProxy = new MySelfJdkProxy(son);
        Person myJdkFather = (Person) myJdkProxy.getProxyInstance();
        myJdkFather.findPerson();
    }
}
