public class ceilling {
    public static void main(String[] args) {
    int [] arr= {1,3,7,8};


    int target=9;
    int  ans= searchceiling(arr, target);
    System.out.println(ans);
}
    private static int searchceiling(int[] arr, int target) {

        int start=0;
        int end= arr.length;


        while (start <= end){
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

        return  start;
    }
}
