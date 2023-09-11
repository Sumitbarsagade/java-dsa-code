import java.util.Arrays;

public class binary2dsearch {
    public static void main(String[] args) {
        int [][] arr2d= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int target= 1;

        int[] ans= searchin2Darr(arr2d, target);
        System.out.println(Arrays.toString(ans));


    }

    //search the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row , int cStart, int cEnd, int target){
        while(cStart<= cEnd){
            int mid = cStart +(cEnd - cStart)/2;
            if(matrix[row][mid]== target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;
            }
            else{
                cEnd= mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] searchin2Darr(int [][] arr2d, int target){
          int rows= arr2d.length;
          int cols= arr2d[0].length;
          if(rows==1){
              return binarySearch(arr2d, 0, 0,cols-1,target);
          }
          int rStart =0;
          int rEnd = rows-1;
          int cMid = cols /2;

          //run the loop till 2 rows are remaining
         while(rStart<(rEnd-1)){
             int mid= rStart+(rEnd -rStart)/2;
             if(arr2d[mid][cMid]==target){
                 return new int[]{mid, cMid};
             }
             if(arr2d[mid][cMid]<target){
                 rStart= mid;
             }
             else {
                 rEnd= mid;
             }
         }
         //now we have two rows
         // check whether the target is in the col of 2 rows
        if(arr2d[rStart][cMid]==target){
            return new int[]{rStart, cMid};
        }
        if(arr2d[rStart+1][cMid]==target){
            return new int[]{rStart+1, cMid};
        }
        //search in 1st half
        if (target <= arr2d[rStart][cMid-1]) {
           return binarySearch(arr2d, rStart, 0, cMid-1, target);
        }

        //search in 2nd half
        if(target>= arr2d[rStart][cMid+1] && target<= arr2d[rStart][cols-1]){
            return binarySearch(arr2d, rStart, cMid+1, cols-1, target);
        }
        //search in 3rd half
        if(target<= arr2d[rStart+1][cMid-1]){
            return binarySearch(arr2d, rStart+1, 0, cMid-1, target);
        }
        // search in 4th half
        else{
            return binarySearch(arr2d, rStart+1, cMid+1, cols-1, target);
        }

        }


}
