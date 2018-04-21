package hbx.factory.absFactory.factoryMethod;

import hbx.factory.FactoryInterface;
import hbx.product.Ball;
import hbx.product.Football;
import hbx.product.Volleyball;

public class VolleyballFactory implements FactoryInterface {
    @Override
    public Ball createBall() {
        return new Volleyball();
    }
}
