package com.company.practice;

/**
 * Created by Woody on 2016/7/30.
 * 方法一对原数组无任何操作？？ 只是打印时调换顺序看效果
 * 方法二把换行后的数组保存在一个新的数组中
 */
public class ExchangeArr {
    public static void main(String[] args) {
        int arr[][] = new int[][] {
            {
                1, 2, 3
            },{
                4, 5, 6
            },{
                7, 8, 9
            }
        } ;
        System.out.println("数组原有内容：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("行列互调后的数组：");
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }   
}
//       //import java.util.Arrays;
//public class ArrayRowColumnSwap { // 创建类
//    public static void main(String[] args) {
//        // 创建2维数组
//        int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//        System.out.println("行列互调前：");
//        // 输出2维数组
//        printArray(arr);
//        int arr2[][] = new int[arr.length][arr.length];
//        for (int i = 0; i < arr.length; i++) {// 调整数组行列数据
//            for (int j = 0; j < arr[i].length; j++) {
//                arr2[i][j] = arr[j][i];
//            }
//        }
//        System.out.println("行列互调后：");
//        // 输出2维数组
//
//        printArray(arr2);
//
//        //System.out.println(Arrays.equals(arr, arr2));
//    }
//
//    private static void printArray(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {// 遍历数组
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");// 输出数组元素
//            }
//            System.out.println();
//        }
//    }
//}