import java.util.Scanner;
public class ch1_p4 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the value in kilometer :\t");
        float km = s.nextFloat();
        double mi;
        mi = (km * 0.62137);
        System.out.println("The value in miles is : "+mi);
    }
}
