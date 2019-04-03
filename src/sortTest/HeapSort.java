package sortTest;

import java.util.Arrays;

public class HeapSort {
    public static void buildMaxHeap(int[] a) {
        int start = (a.length - 1 - 1) / 2 ;
        for (int i = start; i >= 0; i--) {
            maxHeap(a, a.length, i);
        }
    }

    public static void maxHeap(int[] a, int n, int i) {
        int leftChild = i * 2 + 1;
        int rightChild = i * 2 + 2;
        int largest = i;
        if (leftChild < n && a[leftChild] > a[i]) largest = leftChild;

        if (rightChild < n && a[rightChild] > a[largest]) largest = rightChild;

        if (largest != i) {
            int tmp = a[largest];
            a[largest] = a[i];
            a[i] = tmp;
            maxHeap(a, n, largest);
        }
    }

    public static void heapsort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            int tmp = a[0];
            a[0] = a[i];
            a[i] = tmp;
            maxHeap(a, i, 0);
        }
    }

    public static void main(String[] args) {
        int a[] = {
                4, 3, 2, 5, 6, 9, 1, 8, 7, 0
        };
        buildMaxHeap(a);
        heapsort(a);
        System.out.println(Arrays.toString(a));
    }
}
