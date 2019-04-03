package sortTest;

public class MergeSort {
    public static void mergeSortRecursion(int[] a, int begin, int end, int[] tmp) {
        if (begin < end) {
            int mid = (begin + end) / 2;
            mergeSortRecursion(a, begin, mid, tmp);
            mergeSortRecursion(a, mid + 1, end, tmp);
            merge(a, begin, mid, end, tmp);
        }

    }

    public static void merge(int[] a, int begin, int mid, int end, int[] tmp) {
        int i = begin;
        int j = mid + 1;
        int l = 0;
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                tmp[l++] = a[i++];
            } else {
                tmp[l++] = a[j++];
            }
        }
        while (i <= mid) {
            tmp[l++] = a[i++];
        }
        while (j <= end) {
            tmp[l++] = a[j++];
        }
        l=0;
        while(begin<=end){
            a[begin++]=tmp[l++];
        }
    }

    public static void main(String[] args) {
        int a[] = {
                4, 3, 2, 5, 6, 9, 1, 8, 7, 0
        };
        int[] tmp = new int[a.length];
        mergeSortRecursion(a, 0, a.length - 1, tmp);
        for (int i = 0; i < 10; i++) System.out.print(tmp[i] + " ");
    }
}
