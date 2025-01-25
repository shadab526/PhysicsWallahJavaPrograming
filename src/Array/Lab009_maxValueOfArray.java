package Array;

public class Lab009_maxValueOfArray {
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,1,12};
        int ans =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }

        }
        System.out.println("Max value of Array is :"+ans);

    }
}
