package deract;

public class ChuanJiaDan implements IDeractor {
    private int price=20;
    @Override
    public void onDeract() {
        System.out.println("I am chuanjiadan and I am deracted.");
    }

    @Override
    public int getPrice() {
        return price;
    }

}
