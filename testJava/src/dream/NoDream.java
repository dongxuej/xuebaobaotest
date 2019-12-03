package dream;

import dream.base.IDream;

public class NoDream implements IDream {
    @Override
    public void startDream() {
        System.out.println("have no dream.");
    }
}
