package Loops.ForLoops;
import java.util.*;
public class ex002_SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for( int num=1; num<=n; num++ ){
            sum = sum + num;
        }
        System.out.println("Sum of "+n+ ": "+sum);
    }
}
