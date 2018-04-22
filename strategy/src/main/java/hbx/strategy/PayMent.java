package hbx.strategy;

public interface PayMent {
    PayStatus pay(String uuid,double mount);
}
