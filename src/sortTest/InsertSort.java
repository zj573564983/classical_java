package sortTest;

public class InsertSort {
    public static void insertSort(int []a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0&&key<a[j]) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int a[] = {
                4, 3, 2, 5, 6, 9, 1, 8, 7, 0
        };
        insertSort(a);
        for (int i = 0; i < 10; i++) System.out.println(a[i]);
    }
}
