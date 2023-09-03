import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number to check whether it is a prime number or not");
        int a= sc.nextInt();
        isarmstrong(a);
    }

    private static void isarmstrong(int a) {
        int temp =a;
        int sum=0;
        String s= Integer.toString(temp);
        int l= s.length();
        while(a>0){
            int b = a%10;
            a=a/10;
            sum += Sumpower(b,temp);

        }
//        System.out.println(sum);
        if(sum ==temp){
            System.out.println("is Armstrong number");
        }
        else{
            System.out.println("is not Armstrong number");
        }


        
    }

    private static int Sumpower(int b, int a) {
        int d =b;
        int mul=1;
        String c= Integer.toString(a);
        for(int i=0; i<c.length(); i++){
            mul*=d;
        }
        return mul;
    }
}
