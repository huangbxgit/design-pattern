package hbx.decorator;

public class Oranger implements Fruit{

    private Fruit fruit;

    public Oranger(Fruit fruit){
        this.fruit = fruit;
    }

    public int computePrice() {
        System.out.println("橙子的价格是7元");
        int total = fruit.computePrice()+7;
        return total;
    }
}
