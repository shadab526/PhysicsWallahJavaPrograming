package Loops.ForLoops;
import java.util.*;
public class ex004_ReverseBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i=n; i>=1; i-=2){
            System.out.println(i);
        }
    }
}
