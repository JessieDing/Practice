package com.company.practice;

import java.util.Scanner;

/**
 * Created by Woody on 2016/7/7.
 */
public class Diamond {
    public static void main(String args[]) {
        System.out.println("请输入要打印的行数(不得低于3行)");
        Scanner scan = new Scanner(System.in);
        int rows = 0;
        do {
            rows = scan.nextInt();
            if (rows % 2 == 0) {
                System.out.println("请输入奇数！");
            } else {
                break;
            }//必须要break吗？
        }
        while (true);//???
        for (int i = 1; i <= rows; i += 2) {
            for (int kong = rows; kong >= i - 1; kong--) {
                System.out.print(" ");//为什么是print？
            }
            for (int xing = 1; xing <= i; xing++) {
                System.out.print("* ");
            }
            System.out.println();//???为什么空着
        }
        for (int j = 1; j <= rows - 2; j += 2) {
            for (int kong1 = 1; kong1 <= j + 3; kong1++) {
                System.out.print(" ");
            }
            for (int xing1 = rows - 2; xing1 >= j; xing1--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

