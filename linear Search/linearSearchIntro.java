public class linearSearchIntro {
    public static void main(String[] args) {
        //Que : Find whether 4 exists in among or not.
        int[] arr= {1,2,3,4,5,6,7};
        int p=Linearsearch(arr,8);
        System.out.println(p);

    }
    static int Linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0; index<arr.length; index++){
            int element =arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
