import java.util.Scanner;

public class sumofthree {
     public static void main(String[] args) {
        // int a=5;
        // int b=6;
        // int c=5;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the value of a : ");
    int a= sc.nextInt();
    System.out.println("Please enter the value of b : ");

    float b= sc.nextFloat();
    System.out.println("Please enter the value of c : ");

    double c= sc.nextDouble();

    System.out.print("Please enter the value of str : ");
    String stro=sc.nextLine();


    double sum=a+b+c;
    System.out.println("The sum of "+a+", "+b+" and "+c+" is "+sum);
    System.out.println("And value of stro is "+stro); 

    }
}
