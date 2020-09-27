public class Fibo{
    public static void main(String []args){
       int n = 8, t1 = 0, t2 = 1, t, i;
       if(n == 1)
           System.out.print(t1);
       else{
           System.out.print(t1+" "+t2);
           for(i=2;i<n;i++){
               t = t1 + t2;
               System.out.print(" "+t);
               t1 = t2;
               t2 = t;
           }     
       }
    }
}
