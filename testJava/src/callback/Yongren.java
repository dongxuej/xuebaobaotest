package callback;

import java.util.ArrayList;
import java.util.List;

public class Yongren {
    private List<Icallback> m_callback = new ArrayList<>();
    public void buy(){
        System.out.println("佣人我已经买完了菜");
//        for(int i=0;i<m_callback.size();i++){
//            m_callback.get(i).onyongrenmailecai();
//        }

        for (Icallback mm:
             m_callback) {
            mm.onyongrenmailecai();
        }
    }
    public void addCallback(Icallback icallback){
        m_callback.add(icallback);
    }
}
