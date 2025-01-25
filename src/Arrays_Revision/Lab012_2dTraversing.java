package Arrays_Revision;

public class Lab012_2dTraversing {
    public static void main(String[] args) {
        int[][] arr = {{4,5,6},{11,12,13}};
        for (int i = 0; i<arr.length; i++){
            for (int k=0; k<arr[i].length; k++){
                System.out.println(arr[i][k]);
            }
        }
    }
}
