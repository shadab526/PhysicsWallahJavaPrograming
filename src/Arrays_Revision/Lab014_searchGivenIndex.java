package Arrays_Revision;

public class Lab014_searchGivenIndex {
    public static void main(String[] args) {
        int[] arr = {3,5,17,8,12,34,7};
        int x =7;
        int ans = -1;
        for (int i =0; i<arr.length; i++){
            if(x==arr[i]){
                ans =i;
                break;
            }
        }
        System.out.println("Fount "+x+ " at index of "+ans);
    }
}
