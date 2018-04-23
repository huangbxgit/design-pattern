package hbx.adapter;

public class Test {
    public static void main(String[] args) {
        Usb usb = new UsbImpl();
        Adapter adapter = new Adapter(usb);
        adapter.ps2Method();
    }
}
