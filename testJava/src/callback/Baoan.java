package callback;

public class Baoan implements Icallback {
   private String m_name;
   public Baoan(String s){
       m_name = s;
   }
    @Override
    public void onyongrenmailecai() {
        System.out.println("我的名字是：" + m_name + "准备吃饭");
    }
}
