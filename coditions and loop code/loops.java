import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("+++++++++++++++++++++++++++++++");
        for(int i=0; i<=10; i+=2){
            System.out.println(i);
        }

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Enter any number for which you want table");
        Scanner sc=new Scanner(System.in);
        int p = sc.nextInt();
        for(int k=0; k<=10; k++){
            System.out.println(k*p);
        }

        System.out.println("++++++++++++++++++++++++++++++++");
        int num =1;
        while(num <=5){
            System.out.println(num);
            num +=1;
        }
}
}
