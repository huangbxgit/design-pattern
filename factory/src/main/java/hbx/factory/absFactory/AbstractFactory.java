package hbx.factory.absFactory;
import hbx.product.Ball;
public abstract class AbstractFactory {

    public abstract Ball createBasketBall();
    public abstract Ball createFootBall();
    public abstract Ball createVolleyBall();

}
