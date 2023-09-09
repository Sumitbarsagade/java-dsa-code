public class infinitenumsearch {
    public static void main(String[] args) {
        int [] arr= {1,4,5,7,12,18,25,36,39,47,62,74,84,95,101};
        int target=62;
        int  ans= answer(arr, target);
        System.out.println(ans);
    }
    static  int answer(int[]arr, int target){

        int start =0;
        int end =1;


        while(target>arr[end]){
            int temp =end+1;
            end = end +(end-start+1)*2;
            start = temp;
        }
        return  searchBinary(arr, target, start,end);
    }

    private static int searchBinary(int[] arr, int target, int start, int end) {



        while (start<= end){
//            int middle = (start+end)/2;
            int middle = start -(start-end)/2;
            if(arr[middle]==target){
                return middle;
            }
            if (arr[middle]<target)
            {
                start =middle+1;
            }
            if(arr[middle]>target){
                end =middle-1 ;
            }



        }

        return  -1;
    }
}
