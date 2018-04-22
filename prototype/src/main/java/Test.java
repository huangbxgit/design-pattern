import hbx.prototype.Brand;
import hbx.prototype.ClothPrototype;
import hbx.prototype.CopyCloth;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Brand brand = new Brand("吊牌Nike");
        ClothPrototype realCloth = new ClothPrototype("品牌上衣",1.8f,0.6f,brand);
        CopyCloth copyCloth = new CopyCloth(realCloth);
        ClothPrototype myCloth = copyCloth.copyCloth();
        System.out.println("品牌衣服"+realCloth);
        System.out.println("假冒"+myCloth);
        System.out.println("品牌衣服和假冒衣服是否是通过一个对象"+(realCloth == myCloth));
        System.out.println("品牌衣服和假冒衣服的吊牌是否是通过一个对象"+(realCloth.getBrand() == myCloth.getBrand()));
    }
}
