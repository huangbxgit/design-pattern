package hbx.decorator;

public class Banaber implements Fruit{

    private Fruit fruit;

    public Banaber(Fruit fruit){
        this.fruit = fruit;
    }

    public int computePrice() {
        System.out.println("香蕉的价格是3元");
        int total = fruit.computePrice()+3;
        return total;
    }
}
