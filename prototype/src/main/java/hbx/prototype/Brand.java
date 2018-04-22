package hbx.prototype;

/**
 * 品牌类
 * 需要深度复制所以也要实现Cloneable接口
 */
public class Brand implements Cloneable{
    //品牌名称
    private String name;

    public Brand(String name){
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "品牌名称："+name;
    }
}
