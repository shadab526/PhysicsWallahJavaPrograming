package Loops.ForLoops;
import java.util.Scanner;
public class ex001_Print_n_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        // int num =1;
        for (int num = 1; num<=n; num++){
            System.out.println(num);
        }

    }
}
