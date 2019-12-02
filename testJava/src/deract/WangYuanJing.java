package deract;

public class WangYuanJing implements IDeractor {
    int price=5;
    @Override
    public void onDeract() {
        System.out.println("I am wangyuanjing and I am deracted");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
