package String.String_Builder;

public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        // SET CharAT
        str.setCharAt(0,'m');
        System.out.println(str);
        // Append
     //   str.append(" world");
        System.out.println(str);
        // Insert CharAT
        str.insert(2,'y');
        System.out.println(str);
        // Delete CharAt
         str.deleteCharAt(3);
         System.out.println(str);
    }
}
