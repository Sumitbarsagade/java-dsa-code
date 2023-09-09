import java.util.Arrays;

public class findFirstandLastPosition {
    public static void main(String[] args) {
        int [] arr= {1, 3, 5, 5, 5, 5, 67, 123, 125};


        int target=5;
        int[]  ans= searchBinary(arr, target);
        System.out.println(Arrays.toString(ans));
    }
     static int[] searchBinary(int[] arr, int target) {

        int[]ans={-1,-1};

        //check the first occurrence
         ans[0] =search(arr, target, true);
         if(ans[0]!= -1){
             ans[1] = search(arr, target, false);
         }

        return  ans;
    }


    //this function just returns the index value of target
    static  int  search(int[]arr, int target,boolean findStartIndex) {

       int ans =-1;
       int start = 0;
       int end = arr.length - 1;


       while (start <= end) {
//            int middle = (start+end)/2;
           int middle = start - (start - end) / 2;

           if (target<arr[middle]) {
               end= middle-1;
           }
           else if (target>arr[middle]) {
               start =middle+1;
           }
           else   {
               ans =middle;
               if(findStartIndex){
                   end= middle-1;
               }
               else {
                   start=middle+1;
               }
           }
       }
        return ans;
   }
}
