package Array;

public class Lab004_2DArray {
    public static void main(String[] args) {
        int[][] mul_array = new int [3][4];
        mul_array[0][0]=10;
        mul_array[0][1]=20;
        mul_array[0][2]=30;
        mul_array[0][3]=40;
        System.out.println("0 index array");
        System.out.println(mul_array.length);


        System.out.println(mul_array[0][0]);
        System.out.println(mul_array[0][1]);
        System.out.println(mul_array[0][2]);
        System.out.println(mul_array[0][3]);

        mul_array[1][0]=50;
        mul_array[1][1]=60;
        mul_array[1][2]=70;
        mul_array[1][3]=80;
        System.out.println("1 index array");

        System.out.println(mul_array[1][0]);
        System.out.println(mul_array[1][1]);
        System.out.println(mul_array[1][2]);
        System.out.println(mul_array[1][3]);

        mul_array[2][0]=90;
        mul_array[2][1]=100;
        mul_array[2][2]=110;
        mul_array[2][3]=120;
        System.out.println("2 index array");

        System.out.println(mul_array[2][0]);
        System.out.println(mul_array[2][1]);
        System.out.println(mul_array[2][2]);
        System.out.println(mul_array[2][3]);
        System.out.println(mul_array.length);


    }
}
