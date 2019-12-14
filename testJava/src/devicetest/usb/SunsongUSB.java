package devicetest.usb;

public class SunsongUSB implements Iusb {
    @Override
    public UsbType getUsbType() {
        return UsbType.IO_1;
    }

    @Override
    public int getUsbTypeByInt() {
        return 1;
    }

    @Override
    public String getLabel() {
        return "Sunsong";
    }
}
