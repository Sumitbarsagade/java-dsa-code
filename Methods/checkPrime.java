import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number to check whether it is a prime number or not");
        int a= sc.nextInt();
        isPrime(a);
    }

     static void isPrime(int p) {

        if(p==2 || p==3 || p==5){
            System.out.println("Prime");
        }
        else if(p%2==0 || p%3==0 ||p%5==0  ){
            System.out.println("not Prime");

         }
        else{
            System.out.println(" Prime");
        }
    }
}
