package Loops.WhileLoops;
import java.util.*;
public class Ex_002_SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        while (num <= n){
            sum = sum + num;
            num++;
        }
        System.out.println(sum);

    }
}