import java.util.Scanner;
public class ch5_p3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int n = s.nextInt();
        System.out.println("Multiplication table of "+n+" is ");
        System.out.println("---------------------------------");
        int i=0;
        while (i <= 10) {
            System.out.println(n+" X "+i+" = "+(n*i));
            i++;
        }
    }
}
