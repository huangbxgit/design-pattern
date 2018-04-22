package hbx.singleton.layzer;

/**
 * 懒汉式单例，延迟加载，等真正需要用到的时候再实例化
 *  优点节约资源，但是存在线程安全问题，加锁影响性能，用静态内部类实现
 *  即解决了延迟加载，又解决了不加锁的线程安全，性能高
 *  例子：家里唯一的中央空调，不热的时候不开，等热的时候再开
 */
public  class LayzerSingleton {
    private  LayzerSingleton (){

    }

    private static class LayzerHander{
        private static final LayzerSingleton instance = new LayzerSingleton();
    }

    public static LayzerSingleton getInstance() {
        return LayzerHander.instance;
    }
}
