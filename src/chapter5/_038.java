package chapter5;

public class _038 {
    public static void BubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {
                4, 3, 2, 5, 6, 9, 1, 8, 7, 0
        };
        BubbleSort(a);
        for (int i = 0; i < 10; i++) System.out.println(a[i]);
    }
}
