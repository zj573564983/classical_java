package sortTest;

import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int[] a) {
        int n = a.length;
        int i;
        int j;
        int number = n / 2;
        while (number > 0) {
            System.out.println("轮-" + number + ":" + Arrays.toString(a));
            for (i = number; i < a.length; i++) {
                int tmp = a[i];
                j = i - number;
                while (j >= 0 && a[j] > tmp) {
                    a[j + number] = a[j];
                    j -= number;
                }
                a[j + number] = tmp;
            }
            number /= 2;
        }
    }

    public static void main(String[] args) {
        int a[] = {
                10,4, 3, 2, 5, 6, 9, 1, 8, 7, 0
        };
        shellSort(a);
        for (int i = 0; i < 10; i++) System.out.println(a[i]);
    }
}
