package deract;

public class Tank {
    public Tank addDeractor(IDeractor iDeractor){
        iDeractor.onDeract();
        return this;
    }
}
