package proxy.staticProxy.proxy;

import proxy.Person;

public class Fathar implements Person{
    private Person son;
    public Fathar(Person son){
        this.son = son;
    }

    public void findPerson() {
        System.out.println("我是父亲,静态代理，帮儿子找对象");
        son.findPerson();
        System.out.println("成功了");
    }
}
