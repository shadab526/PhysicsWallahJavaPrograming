package Array;

public class Lab011_searchIndexOfArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,12,34,7};
        int x = 7;
        int ans = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x) {

                ans=i;
                break;
            }

        }
        System.out.println("Found "+ x + " at index "+ ans);
    }
}
