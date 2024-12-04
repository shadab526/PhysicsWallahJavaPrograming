package Array;

public class Lab006_arraysTraversing{
    public static void main(String[] args) {
        int[] ages = {22,34,45};
        System.out.println("Using For Loop");
        // 1# Using for loop
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }
        System.out.println("Using For Each Loop");
        // 2# Using for each loop
        for (int age :ages){
            System.out.println(age);
        }
        System.out.println("Using WHile Loop");
        // 3# Using while loop
        int i =0;
        while (i<ages.length){
            System.out.println(ages[i]);
            ++i;
        }


    }
}
