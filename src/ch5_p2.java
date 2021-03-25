import java.util.Scanner;
public class ch5_p2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Ente the last number :\t");
        int i=0;
        int sum=0;
        int n= s.nextInt();
        while (i <= n) {
            sum=sum+2*i;
            i++;
        }
        System.out.println("The sum of first "+n+" natural numbers is :\t"+sum);
    }
}
