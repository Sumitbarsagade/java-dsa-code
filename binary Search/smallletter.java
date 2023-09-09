public class smallletter {
    
    //Find smallest Letter Greater Than Target(leetcode)

    public static void main(String[] args) {
        char [] letters= {'c', 'f', 'j'};
        char target='a';
        
        char ans= searchBinary(letters, target);


            System.out.println(ans);


    }

    private static char searchBinary(char[] letters, int target) {

        int start=0;
        int end= letters.length-1;



        while (start <= end){
//            int middle = (start+end)/2;
            int middle = start -(start-end)/2;


            if (target<letters[middle])
            {
                end=middle-1;
            }
            if(target>letters[middle]){
                start=middle+1;
            }
            if(target==letters[middle]){
                start=middle+1;
            }



        }

        return  letters[start%letters.length];
    }
}
