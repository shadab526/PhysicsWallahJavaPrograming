package Loops.WhileLoops;
import java.util.*;
public class ex004_ReverseBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int num = n;
        while(num<=1){
            System.out.println(num);
            num-=2;


        }


    }

}
