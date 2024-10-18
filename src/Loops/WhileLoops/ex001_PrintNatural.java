package Loops.WhileLoops;
import java.util.*;
public class ex001_PrintNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = 1;
        while (num<=n){
            System.out.println(num);
           // num = num+1;
            num++;
        }
    }
}
