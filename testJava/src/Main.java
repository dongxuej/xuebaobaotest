import dream.ChildDream;
import dream.IDream;
import selfdir.Person;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        IDream somedream = new ChildDream();
        Person p = new Person();
        p.sleep(somedream);
        System.out.println("end of main!");
    }
}
