package deract;

public class Tank {
    private int price=100;
    public Tank addDeractor(IDeractor iDeractor){
        iDeractor.onDeract();
        int dcost = iDeractor.getPrice();
        price = price + dcost;
        return this;
    }
    public int getPrice(){
        return  price;
    }
}
