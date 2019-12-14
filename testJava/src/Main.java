import deract.ChuanJiaDan;
import deract.PaoGuan;
import deract.Tank;
import deract.WangYuanJing;
import devicetest.device.Device;
import devicetest.usb.Iusb;
import devicetest.usb.QinghuaziguangUSB;
import devicetest.usb.SunsongUSB;
import selfdir.Person;

public class Main {
    static void testDeractor(){
        Tank tank = new Tank();
        Tank tank1 = new Tank();
        System.out.println(tank.getPrice());
        tank.addDeractor(new ChuanJiaDan())
                .addDeractor(new WangYuanJing())
                .addDeractor(new PaoGuan())
                .addDeractor(new PaoGuan())
                .addDeractor(new WangYuanJing());
        System.out.println(tank.getPrice());
    }


    static void testDevice(){
        Iusb iusb = new SunsongUSB();
        Iusb iusb1 = new QinghuaziguangUSB();
        Device device = new Device();
        //first day
        device.insertUsb(iusb);
        device.insertUsb(iusb1);
        //the next day,device upgrade
        device.update();
        device.insertUsb(iusb1);
    }
    public static void main(String[] args) {
//        testDeractor();
        testDevice();
        System.out.println("Hello World!");
        Person p = new Person();
        p.sleep();
        System.out.println("end of main!");
    }
}
