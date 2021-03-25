import java.util.Scanner;
public class ch4_p3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter you income in Lakhs : \t");
        float income = s.nextFloat();
        if (income < 250000) {
            System.out.println("No Tax");
        }
        else if (income >= 250000 && income <= 500000) {
            double tax= income*0.05;
            System.out.println("You have to give tax of Rupees "+ tax);
        }
        else if (income >= 500000 && income <= 1000000) {
            double tax= income*0.20;
            System.out.println("You have to give tax of Rupees "+ tax);
        }
        else{
            double tax= income*0.30;
            System.out.println("You have to give tax of Rupees "+ tax);
        }

    }
}
