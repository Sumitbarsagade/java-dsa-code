public class rotatedbinsoltwo {
    public static void main(String[] args) {
        int [] arr= {4,5,6,7,0,1,2};


        int target=1;

        int ans =searchtarget(arr, target);
        System.out.println(ans);

    }

    static int  searchtarget(int[] arr, int target){
        int pivot= searchPivot(arr);
        if(pivot==-1){
            //just do normal binary search
            return searchBinary(arr, target,0,arr.length-1);
        }
        //if pivot is found,you have 2asc
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return searchBinary(arr, target, 0, pivot-1 );

        }
        else{
            return searchBinary(arr, target, pivot+1,arr.length-1);
        }



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
                return middle;

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
