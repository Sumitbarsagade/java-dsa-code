public class searchInRange {
    public static void main(String[] args) {
        int[] arr= {12,44,54,66,76,43,62,87,45,71,64,82,99};
        int start=3;
        int b=7;
        int target=43;
        int ans= searchinrange(arr,start,b,target);
        System.out.println(ans);
    }

     static int searchinrange(int[] arr, int start, int end, int target) {

        if(arr.length==0){
            return -1;
        }

        for( int i=start; i<end; i++){

            if(target==arr[i]){
                return i;
            }

        }
        return -1;
    }
}
