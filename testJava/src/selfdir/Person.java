package selfdir;

import dream.DreamHelper;
import dream.base.IDream;

public class Person {
    public void sleep(){
        IDream dream = DreamHelper.Instance().getLatestDream();
        dream.startDream();
    }
}
