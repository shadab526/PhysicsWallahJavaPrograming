package If_Else;
import java.util.*;
public class ex_006_ariaOfRectangle {
    public static void main(String[] args) {
        //WAP to find area of rectangle is grater then its perimeter.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length.");
        int l = sc.nextInt();
        System.out.println("Enter the breadth.");
        int b = sc.nextInt();
        int p = 2*(l+b);
        int a = l*b;
        if(p>a){
            System.out.println("perimeter is grater then aria");
        }
        else if(p==a){
            System.out.println("aria and perimeter is equal");
        }
        else {
            System.out.println("aria is greater then perimeter");
        }
    }
}
