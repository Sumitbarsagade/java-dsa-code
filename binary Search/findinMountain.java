public class findinMountain {
    public static void main(String[] args) {
        int [] arr= {1,2,4,5,3,1};
        int target=3;

        int  peak= searchpeak(arr);
        int  targetfound= searchIncreasingArray(arr,target,peak);
        if(targetfound==-1){
             targetfound =searchDecreasingArray(arr, target, peak);
        }

        System.out.println(targetfound);



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
    private static int searchDecreasingArray(int[] arr, int target, int peak) {

        int start =peak;
        int end=arr.length-1;

        boolean asc = (arr[start]<arr[end]);
        while (start<=end){

            int mid= start-(start-end)/2;

            if(asc==false){
                if(target<arr[mid]){
                    start =mid+1;
                }
                if(target>arr[mid]){

                    end=mid-1;
                }

            }
            else {
                if(target>arr[mid]){
                    start =mid+1;
                }
                if(target<arr[mid]){

                    end=mid-1;
                }

            }

            if(arr[mid]==target){
                return  mid;
            }
        }

        return -1;
    }
    private static int searchIncreasingArray(int[] arr, int target,int peak) {

        int start=0;
        int end= peak;


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
