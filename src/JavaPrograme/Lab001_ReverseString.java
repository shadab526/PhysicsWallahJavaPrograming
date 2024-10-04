package JavaPrograme;

public class Lab001_ReverseString {
    public static void main(String[] args) {
        String name = "Shadab";
        String rev = "";
        for (int i=name.length()-1;i>=0;i--)
        {
            rev= rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}
