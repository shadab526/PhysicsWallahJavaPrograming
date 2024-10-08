package JavaPrograme;
import java.util.*;

public class Lab004 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Shadab");
        name.add("Zoha");
        name.add("Saquib");
        name.add("Salim");
        name.add("Rasool");
        name.add("Jho");
       name.stream().filter(s->s.length()>4).forEach(s-> System.out.println(s));

    }
}
