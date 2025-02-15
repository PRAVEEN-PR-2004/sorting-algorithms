public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 8, 1, 2, 10, 45 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minInd] > arr[j]) {
                    minInd = j;
                }
            }
            int tem = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = tem;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}