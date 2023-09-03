import java.util.Scanner;

public class stringFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String message=greet();

        String personalised = myGreet (name);
        System.out.println(personalised);

        System.out.println(message);
    }

     static String myGreet(String name) {
        String message = "Hello "+ name;
        return  message;
    }

    static String greet(){
        String greeting = "How are you";
        return greeting;
    }
}
