import java.util.Scanner;
public class name {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String fname=sc.nextLine();
        System.out.println("Enter the last name");
        String lname=sc.nextLine();
        System.out.println("Hello Mr. "+lname+" "+fname);

    }
}
