package sortTest;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 2, 5, 6, 9, 1, 8, 7, 0};
        buildMaxHeap(arr);
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //堆排序
    public static void buildMaxHeap(int[] arr) {
        int i = (arr.length - 1 - 1) / 2;
        for (int j = i; j >= 0; j--)
            maxHeap(arr, arr.length, j);
    }

    public static void maxHeap(int[] a, int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < n && a[left] > a[i]) largest = left;
        if (right < n && a[right] > a[largest]) largest = right;
        if (largest != i) {
            int tmp = a[i];
            a[i] = a[largest];
            a[largest] = tmp;
            maxHeap(a, n, largest);
        }
    }

    public static void heapSort(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            int tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            maxHeap(a, i, 0);
        }
    }

}
