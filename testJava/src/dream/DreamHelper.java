package dream;

public class DreamHelper {
    private static DreamHelper mInstance;

    public static DreamHelper Instance() {
        if(mInstance==null){
            mInstance = new DreamHelper();
        }
        return mInstance;
    }

    private DreamHelper(){}

    public IDream getLatestDream(){
        return new ChildDream();
    }
}
