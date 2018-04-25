package hbx.decorator;

public class Apple implements Fruit{

    private Fruit fruit;

    public Apple(Fruit fruit){
        this.fruit = fruit;
    }

    public int computePrice() {
        System.out.println("苹果的价格是5元");
        int total = fruit.computePrice()+5;
        return total;
    }
}
