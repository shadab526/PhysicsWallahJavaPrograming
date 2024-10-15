package If_Else;
import java.util.*;
public class ex_005_findProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price.");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price.");
        int sp = sc.nextInt();
        if(sp>cp){
            int profit = sp-cp;
            System.out.println("Yor profit is Rs: "+profit);
            }
        else {
            int loss = cp-sp;
            System.out.println("Your loss is Rs: "+loss);
        }

    }
}
