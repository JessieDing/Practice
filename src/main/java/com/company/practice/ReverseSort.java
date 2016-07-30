package com.company.practice;

/**
 * Created by Woody on 2016/7/30.
 */
public class ReverseSort {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        ReverseSort sorter = new ReverseSort();
        sorter.sort(array);
    }
    public void sort(int[] array) {
        System.out.println("原有数组内容：");
        showArray(array);
        int temp;
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
        System.out.println("数组反转后内容：");
        showArray(array);
    }

    public void showArray(int[] array) {
        for (int i:array) {
            System.out.print("\t" + i);
        }
        System.out.println();
    }
}
// 另一种算法：
//    int[] results = new int[array.length];
//for (int i = array.length -1; i >= 0; i--){
//        int value = array[i];
//        int index = array.length - i -1;
//        results[index] = value;
// 一倍时间复杂度？