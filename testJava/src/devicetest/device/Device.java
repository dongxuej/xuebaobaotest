package devicetest.device;

import devicetest.usb.Iusb;
import devicetest.usb.UsbType;

import java.util.ArrayList;
import java.util.List;

/**
 * 场景:
 * 现在有一个设备A,设备A上有很多的USB插口,现在设备软件每次升级可支持的USB设备种类增加,
 * 当有可支持的USB设备插入时,该USB设备应该立即注册到软件中以便软件能够调用该设备
 * */
public class Device {
//    List<UsbType> suppportUSBType;
List<Integer> suppportUSBType_1;

    List<Iusb> mUsbManager;

    public Device(){
//        suppportUSBType = new ArrayList<>();
//        suppportUSBType.add(UsbType.IO_1);

        suppportUSBType_1 = new ArrayList<>();
        suppportUSBType_1.add(1);


        mUsbManager = new ArrayList<>();
    }

    public void insertUsb(Iusb i){
//        boolean iscontain = suppportUSBType.contains(i.getUsbType());
        boolean iscontain = suppportUSBType_1.contains(i.getUsbTypeByInt());
        if(iscontain){
            regist(i);
        }
    }

    public void onBachu(Iusb i){
        unregist(i);
    }
    public void update(){
        System.out.println("Device upgrade now!");
//        suppportUSBType.add(UsbType.IO_2);
//        suppportUSBType.add(UsbType.IO_3);

        suppportUSBType_1.add(2);
        suppportUSBType_1.add(3);
    }
    public void regist(Iusb i){
        mUsbManager.add(i);
        System.out.println("regist a usb,label is:"+i.getLabel());
    }

    public void unregist(Iusb i){
        mUsbManager.remove(i);
        System.out.println("unregist a usb,label is:"+i.getLabel());
    }
}
