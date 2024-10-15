package If_Else;
import java.util.*;
public class ex_003_FindLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println(year+": is Leap Year");
        }
        else{
            System.out.println(year+": is not Leap Year");
        }
    }

}
