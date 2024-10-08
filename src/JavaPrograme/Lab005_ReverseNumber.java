package JavaPrograme;
import java.util.*;
public class Lab005_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc.nextInt();
        int rev = 0;
        while(num>0)
        {
            rev=rev*10 + num%10;// 0*10 + 1234%10 = 4 is current value of rev
            num= num/10; // 1234/10 = 123
        }
        System.out.println(rev);
    }
}
