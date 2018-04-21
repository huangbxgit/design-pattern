package hbx.factory.absFactory.factoryMethod;

import hbx.factory.FactoryInterface;
import hbx.product.Ball;
import hbx.product.Basketball;
import hbx.product.Football;

public class FootballFactory implements FactoryInterface {
    @Override
    public Ball createBall() {
        return new Football();
    }
}
