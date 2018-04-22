package hbx.strategy;

public class YlPay implements PayMent {
    public PayStatus pay(String uuid, double mount) {
        System.out.println("欢迎使用银联");
        System.out.println("正在支付");
        return new PayStatus("200","支付成功",mount);
    }
}
