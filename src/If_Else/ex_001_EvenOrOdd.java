package If_Else;
import java.util.*;

public class ex_001_EvenOrOdd {
    public static void main(String[] args) {
        //Take positive integer input and tell if it is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num+": is even number");
        }
        else {
            System.out.println(num+": is odd number" );
        }
    }

}
