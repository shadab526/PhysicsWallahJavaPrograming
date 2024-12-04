package Array;

public class Lab007_2DArraysTraversing {
    public static void main(String[] args) {
        int[][] mul_array = {{23,34,45},{45,46,47},{55,56,57}};
        for (int i = 0; i < mul_array.length; i++){
            for (int k = 0; k < mul_array[i].length; k++){
                System.out.println(mul_array[i][k]);

            }
        }
    }
}
