package chapter5;

//selection sort
public class _037 {
    private static void seleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int index = i;
            int minVal = a[i];
            for (int j = i + 1; j < n; j++) {
                if (minVal > a[j]) {
                    index = j;
                    minVal = a[j];
                }
            }

            int tmp = a[i];
            a[i] = a[index];
            a[index] = tmp;
        }

    }

    public static void main(String[] args) {
        int a[] = {
                4, 3, 2, 5, 6, 9, 1, 8, 7, 0
        };
        seleSort(a);
        for(int i=0;i<10;i++) System.out.println(a[i]);
    }
}
