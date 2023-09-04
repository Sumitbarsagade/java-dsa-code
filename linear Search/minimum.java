public class minimum {
    public static void main(String[] args) {

        int[] arr= {12,44,54,66,76,43,4,62,87,45,71,64,82,99};
        int ans = searchMinimum(arr);
        System.out.println(ans);
    }

    static int searchMinimum(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int element:arr){
            if(element < min){
                min=element;
            }
        }

        return min;
    }
}
