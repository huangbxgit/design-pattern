package hbx.prototype;

/**
 * 衣服原型类
 *   属性：
 *       名称
 *       长度
 *       宽度
 *       牌子
 */
public class ClothPrototype implements Cloneable{
    private String name;
    private float length;
    private float width;
    private Brand brand;

    public ClothPrototype(String name,float length,float width,Brand brand){
        this.name = name;
        this.length = length;
        this.width = width;
        this.brand = brand;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅克隆，只复制基本类型，和引用类型的引用
        ClothPrototype cp = (ClothPrototype)super.clone();
        //深克隆，将引用类型复制一个新的对象
        cp.setBrand((Brand)cp.getBrand().clone());
        return cp;
    }

    @Override
    public String toString() {
        return "name="+name+"====length:"+length+"====width:"+width
                +"====brand="+brand;
    }

    public String getName() {
        return name;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
