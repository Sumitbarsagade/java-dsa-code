import java.util.Arrays;

public class searrchIn2d {
    public static void main(String[] args) {

        int [][] arr2d ={{1,2,4,5},{6,4,7},{12,17,19}};
        int target=4;
        int[] ans = searrchid2darr(arr2d, target);
        System.out.println(Arrays.toString(Arrays.stream(ans).toArray()));


    }

    private static int[] searrchid2darr(int[][] arr2d, int target) {

        if(arr2d.length==0){
            return new int[] {-1,-1} ;
        }

        for(int row=0; row<arr2d.length; row++){
            for(int coloumn=0; coloumn<arr2d[row].length; coloumn++){
               if(target==arr2d[row][coloumn]){
                   return  new int [] {row, coloumn};
               }
            }
        }


        return  new int[] {-1,-1};
    }
}
