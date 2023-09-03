import java.util.Scanner;

public class swapfunction {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any two number");
        int a = sc.nextInt();
        int b= sc.nextInt();
        swap(a,b);
    }
    static void swap(int x, int y){
        int temp = x;
        x=y;
        y = temp;
        System.out.println(x +" "+ y);



    }
}
