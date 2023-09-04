public class evenDigitArray {
    public static void main(String[] args) {
        int[] arr= {12,44,54,66,-76,143,62,87,-45,71,64,682,99};

        int ans= searchEvenDigitInArray2(arr);
        System.out.println(ans);
    }

    private static int searchEvenDigitInArray2(int[] arr) {
        int count=0;
        if(arr.length==0){
            return -1;
        }
        for(int element: arr){
            if(element<0){
                element= element*-1;
            }
            int num= (int) (Math.log10(element)+1);

            if(num%2==0){
                count++;
            }

        }

        return count;
    }


    private static int searchEvenDigitInArray(int[] arr) {

        if(arr.length==0){
            return -1;
        }


        int nume=0;
        for(int element: arr){

            int count=0;
            if(element<0) {
                element=element*-1;
            }
                while (element > 0) {
                    element = element / 10;

                    count++;
                }

            if(count%2==0){
                nume++;
            }
        //or

//            for(int num: num){
//                if(even(num)){
//                    count++
//                }
//            }

        }

        return nume;
    }
}
