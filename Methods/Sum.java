import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a  = sc.nextInt();
        int b =sc.nextInt();
        int ans= sumofnumbers(a,b);
        System.out.println("The sum of the numbers is:" + ans);

        hello();
    }

    static void hello(){
// Here nothing is return
        System.out.println("Hello world!");
    }
    static  int sumofnumbers(int x,int y){
        // returning of same data type is needed
        return  x+y;
    }
}
