package hbx.factory;

import hbx.product.Ball;

//工厂基类
public interface FactoryInterface {
    //创建产品球
    Ball createBall();
}
