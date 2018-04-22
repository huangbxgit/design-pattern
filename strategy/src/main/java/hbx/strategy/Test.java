package hbx.strategy;

public class Test {
    public static void main(String[] args) {
        Order order = new Order("11111",888.88);
       // PayMent pay = new AliPay();
       //  pay = new WxPay();
        order.pay(PayConstants.YLPAY);
    }

}
