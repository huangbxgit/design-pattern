package hbx.factory.absFactory.factoryMethod;

import hbx.factory.FactoryInterface;
import hbx.product.Ball;
import hbx.product.Basketball;

public class BasketballFactory implements FactoryInterface {
    @Override
    public Ball createBall() {
        return new Basketball();
    }
}
