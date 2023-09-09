public class peakIndex {
    public static void main(String[] args) {
        int [] arr= {1,4,7,12,25,26,17,15,11,9,6};


        int  ans= searchpeak(arr);
        System.out.println(ans +" :" +arr[ans]);
    }
    private static int searchpeak(int[] arr) {

        int start=0;
        int end= arr.length;


        while (start < end){
//            int middle = (start+end)/2;
            int middle = start -(start-end)/2;
            if(arr[middle]<arr[middle+1]){
                start=middle+1;
            }
            if (arr[middle]>arr[middle+1])
            {
                end =middle;
            }

        }

        return  start;
    }


}