public class multiDimensionalArray {
    public static void main(String[] args) {


        //Delaration
        int [][] arr= new int [3][];

        int [][] arr3 ={{1,3,4}, {4,5},{5,54,3,2}};


//        for(int[] element: arr3){
//            for(int value: element){
//                System.out.print(value +" ");
//
//            }
//            System.out.println(" ");
//        }
        for(int row=0; row<arr3.length; row++){
            for(int coloum=0; coloum<arr3[row].length; coloum++){
                System.out.print(arr3[row][coloum] +" ");

            }
            System.out.println(" ");
        }


    }



}
