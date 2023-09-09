public class orderAgnoBinarySearch {
    public static void main(String[] args) {
        int[] arr={98,87,67,56,49,34,28,19,4,2,1};
        int target=49;
        int ans= searchtarget(arr, target);
        System.out.println(ans);
    }

    private static int searchtarget(int[] arr, int target) {

        int start =0;
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

}
