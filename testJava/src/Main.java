import callback.Baoan;
import callback.Chushi;
import callback.Yongren;
import deract.ChuanJiaDan;
import deract.PaoGuan;
import deract.Tank;
import deract.WangYuanJing;
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
    static void testMaicai(){
        Chushi zhangsan = new Chushi("zhangsan");
        Chushi wangmazi = new Chushi("王麻子");
        Yongren wangwu = new Yongren();
        Baoan bendan = new Baoan("bendan");
        wangwu.addCallback(bendan);
        wangwu.addCallback(wangmazi);
        wangwu.buy();
    }
    public static void main(String[] args) {
        testMaicai();
        //testDeractor();
        System.out.println("Hello World!");
        //Person p = new Person();
        //p.sleep();
        System.out.println("end of main!");
    }
}
