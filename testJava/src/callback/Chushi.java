package callback;

public class Chushi implements Icallback{
    private String name;
    public  Chushi(String s_name){
        name = s_name;
    }

    @Override
    public void onyongrenmailecai() {
        System.out.println("chushi mingzishi:"+name+"我收到佣人买的菜了，现在开始炒菜");
    }
}
