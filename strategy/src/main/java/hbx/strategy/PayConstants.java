package hbx.strategy;

public enum PayConstants {
    ALPAY(new AliPay()),WXPAY(new WxPay()),YLPAY(new YlPay());
    private PayMent payMent;
    private PayConstants(PayMent payMent){
        this.payMent = payMent;
    }

    public PayMent getPayMent(){
        return payMent;
    }
}
