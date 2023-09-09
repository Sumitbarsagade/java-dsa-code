public class floor {
    public static void main(String[] args) {
        int [] arr= {4,5,7,12,18,25,36,39,47,62,74,84,95,101};


        int target=3;
        int  ans= searchfloor(arr, target);
        System.out.println(ans);
    }
    private static int searchfloor(int[] arr, int target) {

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

        return  end;
    }
}
