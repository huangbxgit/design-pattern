import hbx.singleton.hunger.HungerSingleton;
import hbx.singleton.layzer.LayzerSingleton;
import hbx.singleton.register.RegisterSingleton;
import hbx.singleton.register.TestPojo;
import hbx.singleton.register.TestPojo1;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) throws Exception {
        // 模拟并发的线程数
        int count = 200;

        // 发令枪
        final CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread(){
                @Override
                public void run() {
                    try{

                        try {
                            // 阻塞，count = 0 就会释放所有的共享锁，模拟多线程并发
                            latch.await();
                        } catch (Exception e){
                            e.printStackTrace();
                        }

                        /*
                         * 可能会有很多线程同时去访问getInstance()
                         * 这里可放饿汉式，懒汉式，注册登记式的单例进行测试
                         */
//                        Object obj = LayzerSingleton.getInstance();
//                        Object obj = HungerSingleton.getInstance();
                        Object obj = RegisterSingleton.getInstance(TestPojo.class.getName());
                        Object obj1 = RegisterSingleton.getInstance(TestPojo1.class.getName());
                        System.out.println(System.currentTimeMillis() + ":" + obj+obj1);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();

            // 每循环一次，就启动一个线程，每次启动一个线程，count --
            latch.countDown();
        }
        long end = System.currentTimeMillis();

        // 让主线程延时，该延时期间内，模拟的多线程会去并发访问获取单例的方法
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("总耗时：" + (end - start));
    }
}
