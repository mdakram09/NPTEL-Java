class BubbleSort {
    public static void main(String args[]) {
        int data[] = { 32, 71, 12, 45, 26 };
        int i, step, n = 5, temp;
        for (step = 0; step < n - 1; ++step) {
            for (i = 0; i < n - step - 1; ++i) {
                if (data[i] > data[i + 1]) {
                    temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }
        System.out.print("Array after sorting is: ");
        for (i = 0; i < n; ++i)
            System.out.print(data[i] + " ");
    }
}
