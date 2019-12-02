import deract.ChuanJiaDan;
import deract.PaoGuan;
import deract.Tank;
import deract.WangYuanJing;
import selfdir.Person;

public class Main {
    static void testDeractor(){
        Tank tank = new Tank();
        tank.addDeractor(new ChuanJiaDan())
                .addDeractor(new WangYuanJing())
                .addDeractor(new PaoGuan())
                .addDeractor(new WangYuanJing());
    }
    public static void main(String[] args) {
        testDeractor();
        System.out.println("Hello World!");
        Person p = new Person();
        p.sleep();
        System.out.println("end of main!");
    }
}
