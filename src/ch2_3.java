import java.util.Scanner;
public class ch2_3 {
    public static void main(String[] args) {
        int a= 7;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number :\t");
        int n= s.nextInt();
        if (a>n){
            System.out.println("The given number is greater then the input number");
        }
        else{
            System.out.println("The given number is less then the input number");
        }
    }
}
