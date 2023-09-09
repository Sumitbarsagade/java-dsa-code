public class countRotation {
    public static void main(String[] args) {
        int [] arr= {15,18,2,3,6,12};


        int  pivot= searchPivot(arr);
        System.out.println(pivot+1);

    }

    static  int searchPivot(int[] arr){
        int start=0;
        int end= arr.length-1;


        while (start<= end){
            int middle = start -(start-end)/2;

            if(middle<end  &&  arr[middle] > arr[middle+1]){
                return  middle;

            }
            if(middle>start && arr[middle]<arr[middle-1]){
                return middle-1;

            }
            if(arr[middle]<=arr[start]){
                end =middle-1;
            }
            else{
                start =middle+1;
            }

        }

        return -1;
    }
}
