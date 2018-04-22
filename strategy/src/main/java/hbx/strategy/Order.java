package hbx.strategy;

public class Order {
    private String uuid;
    private double mount;

    public Order(String uuid, double mount) {
        this.uuid = uuid;
        this.mount = mount;
    }

    public PayStatus pay(PayConstants payConstants){
       return  payConstants.getPayMent().pay(this.uuid,this.mount);
    }

}
