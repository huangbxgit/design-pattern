package hbx;

import hbx.factory.FactoryInterface;
import hbx.factory.absFactory.AbstractFactory;
import hbx.factory.absFactory.BallFactory;
import hbx.factory.absFactory.factoryMethod.BasketballFactory;
import hbx.factory.absFactory.factoryMethod.FootballFactory;
import hbx.factory.absFactory.factoryMethod.VolleyballFactory;

public class Test {
    public static void main(String[] args) {
        /**
         * 工厂方法模式
         *   优点：
         *     1、将创建产品的细节封装起来，用户只需要调用此工厂方法就能获取产品
         *     2、新增产品只要增加相应工厂实例，不需要修改代码，对扩展开发修改关闭
         *   缺点：
         *     1、用户调用的时候需要知道具体工厂类
         *     2、如果产品非常多，相应的工厂实例也非常多
         */
        FactoryInterface factoryBasket = new BasketballFactory();
        System.out.println( factoryBasket.createBall().getBallType());
        FactoryInterface factoryFoot = new FootballFactory();
        System.out.println( factoryFoot.createBall().getBallType());
        FactoryInterface factoryVolley = new VolleyballFactory();
        System.out.println( factoryVolley.createBall().getBallType());

        /**
         * 抽象工厂模式
         *   优点：
         *     1、将创建工厂的细节封装起来，用户只需要调用此工厂方法就能获取产品
         *     2、调用简单，是工厂方法模式的进一步抽象，用户不需要知道具体工厂类型
         */
        AbstractFactory ballFactory = new BallFactory();
        System.out.println(ballFactory.createBasketBall().getBallType());
        System.out.println(ballFactory.createFootBall().getBallType());
        System.out.println(ballFactory.createVolleyBall().getBallType());
    }
}
