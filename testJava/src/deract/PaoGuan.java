package deract;

public class PaoGuan implements IDeractor {
    private int price=10;
    @Override
    public void onDeract() {
        System.out.println("I am paoguan and I am deracted");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
