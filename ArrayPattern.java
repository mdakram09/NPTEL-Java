public class ArrayPattern {

    public static void main(String[] args) {
        int twod[][] = new int[4][];
        int i, j, c = 0;
        for (i = 0; i < 4; i++)
            twod[i] = new int[i + 1];
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                twod[i][j] = c;
                c++;
                System.out.print(twod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
