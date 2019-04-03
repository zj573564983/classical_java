package sortTest;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {10,4, 3, 2, 5, 6, 9, 1, 8, 7, 0};
        int[] tmp = new int[arr.length];
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] array) {
        int number = array.length / 2;
        int i;
        int j;
        int temp;
        while (number >= 1) {
            System.out.println("轮-"+number+":"+Arrays.toString(array));
            for (i = number; i < array.length; i++) {
                temp = array[i];
                j = i - number;
                while (j >= 0 && array[j] > temp) { //需要注意的是，这里array[j] < temp将会使数组从大到小排序。
                    array[j + number] = array[j];
                    j = j - number;
                }
                array[j + number] = temp;
            }
            number = number / 2;
        }
    }
}
