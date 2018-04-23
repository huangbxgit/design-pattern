package hbx.adapter;

public class Adapter implements Ps2 {

    private Usb usb;

    public Adapter(Usb usb){
        this.usb = usb;
    }

    public void ps2Method() {
        System.out.println("我是ps2设备，但是主机上没有ps2口");
        System.out.println("所以我需要转换为USB口");
        System.out.println("开始转换");
        usb.isUsbMethod();
        System.out.println("转换成功");
    }
}
