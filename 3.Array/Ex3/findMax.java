package Ex3;

public class findMax {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max ){
                    max = arr[i][j];
                }
            }

        }
        System.out.println(" Max = " + max);
    }
}
