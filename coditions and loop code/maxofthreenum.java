import java.util.Scanner;

public class maxofthreenum {
    public static void main(String[] args) {
        System.out.println("Enter any three number");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
   //Method 1:

        if(a>b && a>c){
            System.out.println("first number is greater");
        } else if (b>a && b>c) {
            System.out.println("second number is greater");
        }
        else{
            System.out.println("third number is greater");
        }
//Method 2:
//        int max = a;
//        if(b>max){
//            max =b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);

        int max =0;
        if(a>b){
            max =c;
        }
        else{
            max= c;
        }
        if(c>max){
            max =c;
        }

        System.out.println(max);


    }
}
