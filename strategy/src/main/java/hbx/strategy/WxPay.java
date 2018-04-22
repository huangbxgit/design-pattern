package hbx.strategy;

public class WxPay implements PayMent {
    public PayStatus pay(String uuid, double mount) {
        System.out.println("欢迎使用微信");
        System.out.println("正在支付");
        return new PayStatus("200","支付成功",mount);
    }
}
