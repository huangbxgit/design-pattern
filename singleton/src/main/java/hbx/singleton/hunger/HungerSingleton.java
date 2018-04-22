package hbx.singleton.hunger;

/**
 * 饿汉式的，初始化就加载，线程安全，耗内存，不管用没用都占用
 * 例子：家里只有一台中央空调，不管天气热不热只要有电就开着很耗电
 */
public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();

    private  HungerSingleton(){

    }

    public static HungerSingleton getInstance(){
        return instance;
    }
}
