public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 49, 8, 1, 2, 10, 45 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
