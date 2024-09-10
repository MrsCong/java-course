package com.wzc.javase.about.sortAlgorithm;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/6 16:13
 */
public class SortUtil {

    private static int[] arr = {1, 5, 7, 2, 3, 6};

    /**
     * 功能描述: 插入排序(O(n的2次方))
     *
     * @param arr
     * @return void
     * @author 吴智聪
     * @date 2023/6/6 16:14
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int indexVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && indexVal < arr[insertIndex]) {
                arr[i] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = indexVal;
        }
    }

    /**
     * 功能描述: 冒泡排序(O(n的二次方))
     *
     * @param arr
     * @return void
     * @author 吴智聪
     * @date 2023/6/6 16:48
     */
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        while (len > 0) {
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            len--;
        }
    }

    /**
     * 功能描述: 快速排序(best:nlogn last:n的平方)
     * 选取一个基准数  两边都往这边跑
     *
     * @param arr
     * @param start
     * @param end
     * @return void
     * @author 吴智聪
     * @date 2023/6/6 19:06
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int low = start;
        int high = end;
        int temp = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= temp) {
                high--;
            }
            while (low < high && arr[low] <= temp) {
                low++;
            }
            //两边同时往中间基准数靠  然后交换
            if (low < high) {
                int t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;
            }
        }
        //然后把基准数与第一个数调换
        arr[start] = arr[low];
        arr[low] = temp;
        quickSort(arr, start, low - 1);
        quickSort(arr, low + 1, end);
    }

    /**
     * 功能描述: 选择排序(O(n的平方))
     *
     * @param arr
     * @return void
     * @author 吴智聪
     * @date 2023/6/6 19:16
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    /**
     * 打印数组
     */
    public static void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        quickSort(arr, 0, arr.length - 1);
        printArr();

    }



}