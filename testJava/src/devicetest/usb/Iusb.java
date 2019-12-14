package devicetest.usb;

public interface Iusb {
    UsbType getUsbType();

    int getUsbTypeByInt();
    String getLabel();
}
