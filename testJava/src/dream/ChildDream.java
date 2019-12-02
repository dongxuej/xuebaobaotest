package dream;

import dream.base.IDream;

public class ChildDream implements IDream {
    @Override
    public void startDream() {
        System.out.println("this dream from child.");
    }
}
