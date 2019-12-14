package devicetest.usb;

//import static devicetest.usb.IusbType.IO_3;

public class QinghuaziguangUSB implements Iusb {
    @Override
    public UsbType getUsbType() {
        return UsbType.IO_3;
    }

    @Override
    public int getUsbTypeByInt() {
        return devicetest.usb.AbsusbType.IO_V1;
    }

    @Override
    public String getLabel() {
        return "Qinghuaziguang";
    }
}
