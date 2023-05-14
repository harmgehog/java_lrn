package homework5;

public class task3 {
    /* Реализовать алгоритм пирамидальной сортировки (HeapSort) */

    public static void main(String[] args) {
        int[] arr = {23, 14, 17, 1, 2, 3, 99};
        sort(arr);
        for (int el : arr) System.out.print(el + " ");
    }

    public static void sort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) heap(arr, arr.length, i);
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[0] = arr[0] ^ arr[i] ^ (arr[i] = arr[0]);
            heap(arr, i, 0);
        }
        System.out.print("Массив отсортирован: ");
    }

    static void heap(int[] arr, int n, int i) {
        int max = i;

        if (2*i+1 < n && arr[2*i+1] > arr[max]) max = 2*i+1;
        if (2*i+2 < n && arr[2*i+2] > arr[max]) max = 2*i+2;
        if (max != i) {
            arr[max] = arr[max] ^ arr[i] ^ (arr[i] = arr[max]);
            heap(arr, n, max);
        }
    }
}



