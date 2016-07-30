package com.company.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Woody on 2016/7/29.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {63, 4, 24, 1, 3, 15};
        SelectSort sorter = new SelectSort();
        sorter.sort(array);
    }

    public void sort(int[] array) {
        int index;
        for (int i = 1; i <array.length; i++) {
            index = 0;//最大值？
            for (int j = 1; j <= array.length - i; j++) {
                if (array[j] > array[index]) {
                    index = j;
                }
            }
            int temp = array[array.length - i];
            array[array.length - i] = array[index];
            array[index] = temp;
        }

        showArray(array);
    }

    public void showArray(int[] array) {
        for (int i : array) {
            System.out.print(">" + i);
        }
        System.out.println();
    }
}
