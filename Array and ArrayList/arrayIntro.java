import java.util.Arrays;
import java.util.Scanner;

public class arrayIntro {
    public static void main(String[] args) {

        // Syntax
        //datatype[] variable_name = new datatype[size];
        int[] roll_no = new int[5];
        //datatype ref.variable = creating the object in heap memory
        // or directly
        int[]nums ={23,43,5,4,5,44};

        //String str= null;
        //int num = null;--> This will not work

       int[] arr= new int[5];
       arr[0]= 23;
        arr[1]= 34;
        arr[2]= 54;
        arr[3]= 64;
        arr[4]= 45;
//      arr[5]= 24; --> ArrayIndexOutOfBoundsException will be raised

        System.out.println(arr[3]);

//        for (int i : arr) {
//            System.out.println(i);
//        }

        for (int num:arr) {
            System.out.print(num +" ");
        }

        System.out.println("Enter any five words");
        Scanner sc= new Scanner(System.in);
        String [] str =new String[5];
        for(int i=0; i<str.length; i++){

            str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));








    }
}
