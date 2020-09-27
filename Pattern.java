public class Pattern{
    public static void main(String []args){
       int n = 4, i, j;
       for(i = 1; i <= 4; i++){
           for(j = 1; j <= i-1; j++){
               System.out.print("* ");
           }
           System.out.println("*");
       }
    }
}
