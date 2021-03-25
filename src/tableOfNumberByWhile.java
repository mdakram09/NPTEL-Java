import java.util.Scanner;
public class tableOfNumberByWhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int i=1;
        System.out.println("Table of "+n+" is");
        System.out.println("----------------------------------------------------------");
        while (i<=10){
            System.out.println(n+" X "+i+" = "+n*i);
            i++;
        }
    }
}
