package hbx.prototype;

public class CopyCloth {

    private ClothPrototype realCloth;

    public  CopyCloth(ClothPrototype realCloth){
        this.realCloth = realCloth;
    }

    public ClothPrototype copyCloth() throws CloneNotSupportedException {

        return (ClothPrototype)realCloth.clone();
    }
}
