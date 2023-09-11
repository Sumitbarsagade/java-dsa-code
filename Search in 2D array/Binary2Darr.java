import java.util.Arrays;
//get the target index number from a 2d array which sorted row and column wise
public class Binary2Darr {
    public static void main(String[] args) {
        int [][] arr2d= {{10,20,30,40},
                         {15,25,35,45},
                         {28,29,37,49},
                         {30,34,38,50}};

        int target= 51;

        int[] ans= searchin2Darr(arr2d, target);
        System.out.println(Arrays.toString(ans));


    }

    private static int[] searchin2Darr(int[][] arr2d, int target) {

        int row=0;
        int coloumn = arr2d.length-1;

        while (row<coloumn){


            if(target < arr2d[row][coloumn]){
                coloumn--;
            }
            else if(target > arr2d[row][coloumn]){
                row++;
            }
            if(target==arr2d[row][coloumn]){
                return new int[]{row,coloumn};
            }


        }

        return new int[]{-1,-1};
    }


}
