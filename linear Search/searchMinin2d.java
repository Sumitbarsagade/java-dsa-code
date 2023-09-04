import java.util.Arrays;

public class searchMinin2d {
    public static void main(String[] args) {
        int [][] arr2d ={{10,2,4,5},{6,4,7},{12,17,19}};
        int target=4;
        int ans = searchForMin(arr2d);
        System.out.println(ans);

    }

    private static int searchForMin(int[][] arr2d) {

        int min= arr2d[0][0];

        if(arr2d.length==0){
            return -1 ;
        }

        for (int[] row : arr2d) {
            for (int value : row) {
                if (value < min) {
                    min = value;

                }
            }
        }


        return  min;

    }
}
