import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int num = sc.nextInt();
        int  rev = 0;
        while(num > 0){
           int rem = num%10;
           rev = 10*rev +  rem;
           num /= 10;
        }
        System.out.println(rev);
    }
}
