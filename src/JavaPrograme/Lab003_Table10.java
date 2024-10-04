package JavaPrograme;
import java.util.*;

public class Lab003_Table10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Table Number");
        int num=sc.nextInt();

      //  int num =10;
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
