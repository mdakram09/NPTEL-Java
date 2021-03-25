import java.util.Scanner;

public class ch5_p4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int n = s.nextInt();
        System.out.println("Multiplication table of "+n+" is ");
        System.out.println("---------------------------------");
        int i=10;
        while (i >=0) {
            System.out.println(n+" X "+i+" = "+(n*i));
            i--;
        }
    }
}
