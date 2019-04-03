package search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {10, 4, 3, 2, 5, 6, 9, 1, 8, 7, 0};
        Arrays.sort(a);
        int i = 1;
        System.out.println(binarySearch(a, i));
    }

    public static int binarySearch(int[] a, int flag) {
        int begin = 0;
        int end = a.length - 1;
        int result = -1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;//防止溢位
            if (a[mid] > flag) end = mid - 1;
            if (a[mid] < flag) begin = mid + 1;
            if (a[mid] == flag) {
                result = mid;
                break;
            }
        }
        return result;
    }
}
