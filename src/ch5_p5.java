import java.util.Scanner;





//it is left










public class ch5_p5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :\t");
        int n=s.nextInt();
        int fact=0;
        for (int i=0; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("factorial is : \t "+fact);
    }
}

