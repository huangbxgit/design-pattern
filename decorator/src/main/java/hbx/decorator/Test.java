package hbx.decorator;

public class Test {
    public static void main(String[] args) {
        Fruit fs = new FruitShop();
        fs =  new Apple(fs);
        fs = new Banaber(fs);
        fs = new Oranger(fs);
        System.out.println(fs.computePrice());
    }

}
