import java.util.Scanner;

public class Driving_License {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= sc.nextInt();
        switch(age){

            case 18:
                System.out.println("Yes! you can drive");
                break;

            case  17:
                System.out.println("No! you cannot drive");
                break;

            default:
                System.out.println("I am default");


        }
    }
}
