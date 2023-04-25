package homework3;

public class task4 {
    public static void main(String[] args) {
        /* *Реализовать алгоритм сортировки слиянием*/
        int[] arr = {3, 7, 5, 4, 2, 0, 90, 43, 11, 22, 44, 33, 33};
        // 0 2 3 4 5 7 11 22 33 33 43 44 90
        for (int x : sortMerge(arr)) System.out.print(x + " ");
    }

    static int[] sortMerge(int[] arr) {
        if (arr.length == 1) return arr;

        int[] left = new int[arr.length / 2];
        System.arraycopy(arr, 0, left, 0, arr.length / 2);
        int a = arr.length - arr.length / 2;
        int[] right = new int[a];
        System.arraycopy(arr, arr.length / 2, right, 0, a);
        arr = mergeArray(sortMerge(left), sortMerge(right));
        return arr;
    }

    static int[] mergeArray(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];
        int l = 0, r = 0;

        for (int i = 0; i < array.length; i++) {
            if (l > left.length - 1) {array[i] = right[r]; r++;}
            else if (r > right.length - 1) {array[i] = left[l]; l++;}
            else if (left[l] < right[r]) {array[i] = left[l]; l++;}
            else {array[i] = right[r]; r++;}
        }
        return array;
    }
}
