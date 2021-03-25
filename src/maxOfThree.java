import java.util.Scanner;
public class maxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if (a>b && a>c){
            System.out.printf("%d is greater then both %d and %d \n",a,b,c);
        }
        else if (b>c){
            System.out.printf("%d is greater then both %d and %d \n",b,a,c);
        }
        else{
            System.out.printf("%d is greater then both %d and %d \n",c,a,b);
        }

    }
}
