package Loops.ForLoops;

import java.util.Scanner;

public class ex005_NumberMultiply2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i =1; i<=n; i*=2){
            System.out.println(i);
        }

    }
}
