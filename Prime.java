class Prime {
     public static void main(String args[]) {
          int num = 12, i = 0, isPrime = 0;
          if (num == 0 || num == 1)
               System.out.print(num + " is not Prime Number");
          else {
               for (i = 2; i < num / 2; i++) {
                    if (num % i == 0) {
                         System.out.print(num + " is not a Prime Number");
                         isPrime = 1;
                         break;
                    }
               }
               if (isPrime == 0)
                    System.out.print(num + " is a Prime Number");
          }
     }
}
