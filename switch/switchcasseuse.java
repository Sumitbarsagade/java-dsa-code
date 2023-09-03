import java.util.Scanner;

public class switchcasseuse {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String fruit=sc.next();

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Orange":
//                System.out.println("Orange color fruits");
//                break;
//            case "Apple":
//                System.out.println("An apple a day keeps doctor away");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit");
//        }

        switch(fruit){
            case "Mango"-> System.out.println("King of fruits");
            case "Orange"-> System.out.println("Orange color fruit");
            case "Apple"-> System.out.println("An apple a day keeps doctor away");
            case "Grapes"-> System.out.println("Small fruit");
            default-> System.out.println("Please enter a valid fruit");

        }
    }
}
