import java.util.Scanner;
public class tableOftwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println("Table of "+n+" is");
        System.out.println("----------------------------------------------------------");
        for (int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
