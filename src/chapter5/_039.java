package chapter5;

public class _039 {
    public static void QuickSort(int[] a, int begin, int end) {
        if (begin < end) {
            int flag = a[begin];
            int i = begin;
            int j = end;
            while(i<j){
                while(i<j&&a[j]>flag)  j--;
                if(i<j) a[i]=a[j];

                while(i<j&&a[i]<flag) i++;
                if(i<j) a[j]=a[i];
            }
            a[i] = flag;
            QuickSort(a, begin, i - 1);
            QuickSort(a, i+1, end);
        }
    }

    public static void main(String[] args) {
        int a[] = {
                4, 3, 2, 5, 6, 9, 1, 8, 7, 0
        };
        QuickSort(a, 0, a.length - 1);
        for (int i = 0; i < 10; i++) System.out.println(a[i]);
    }
}
