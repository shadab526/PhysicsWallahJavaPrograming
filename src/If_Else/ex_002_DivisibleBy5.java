package If_Else;
import java.util.*;
public class ex_002_DivisibleBy5 {
    public static void main(String[] args) {
        //Take positive integer input and tell if it is divisible by or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num%5 ==0){
            System.out.println(num+": is divisible by 5");
        }
        else{
            System.out.println(num+": is not divisible by 5");
        }
    }
}
