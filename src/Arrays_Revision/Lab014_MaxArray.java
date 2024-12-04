package Arrays_Revision;

public class Lab014_MaxArray {
    public static void main(String[] args) {
        int[] arr = {5,8,23,7,4,};
        int max = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("Max of Array is :"+max);
    }
}
