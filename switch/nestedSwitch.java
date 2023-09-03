import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id= sc.nextInt();

        System.out.println("Enter the ID number");
        switch (id){

            case 1:{
                System.out.println("Sumit");
            }
            break;
            case 3:{
                System.out.println("Rahul");
            }
            break;
            case 4:{
                System.out.println("Enter the department name");
                String dp =sc.next();
                switch (dp){
                    case "IT":{
                        System.out.println("kiran, works in IT department");
                    }
                    break;
                    case "Management":{
                        System.out.println("kiran, works in management department");
                    }
                    break;
                    default:
                }
            }
        }
    }
}
