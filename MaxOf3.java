class MaxOf3 {
    public static void main(String args[]) {
        int a = 8, b = 5, c = 34, max;
        max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.print(max + " is the maximum of three numbers");
    }
}
