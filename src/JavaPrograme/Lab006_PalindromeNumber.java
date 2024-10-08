package JavaPrograme;

import java.util.Scanner;

public class Lab006_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc.nextInt();
        int org_num=num;
        int rev = 0;
        while(num>0)
        {
            rev=rev*10 + num%10;// 0*10 + 1234%10 = 4 is current value of rev
            num= num/10; // 1234/10 = 123
        }
        if(org_num==rev)
        {
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not Palindrome number");
        }
    }
}
