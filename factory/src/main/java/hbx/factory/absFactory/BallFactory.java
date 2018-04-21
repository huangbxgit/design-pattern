package hbx.factory.absFactory;

import hbx.product.Ball;
import hbx.product.Basketball;
import hbx.product.Football;
import hbx.product.Volleyball;

public class BallFactory extends AbstractFactory{
    @Override
    public Ball createBasketBall() {
        return new Basketball();
    }

    @Override
    public Ball createFootBall() {
        return new Football();
    }

    @Override
    public Ball createVolleyBall() {
        return new Volleyball();
    }
}
