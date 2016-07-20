package com.company.practice;

import java.util.Scanner;

/**
 * Created by Woody on 2016/7/7.
 */
public class Var_01 {
    public static void main(String args[]) {
        System.out.println("请任意输入一个正整数：");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x % 2 == 0) {
            System.out.println("这是一个偶数");
        } else {
            System.out.println("这是一个奇数");}
        }
    }
