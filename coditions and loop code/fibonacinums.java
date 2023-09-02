import java.util.Scanner;

public class fibonacinums {

    public static void main(String[] args) {

        System.out.println("Enter the number of fibonacci numbers you want");
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int a= 0;
        int b= 1;
        int count = 2;
        while(count <=n){
            int temp =b;
            b+=a;
            a= temp;
            count++;
        }
        System.out.println(b);

    }


}
