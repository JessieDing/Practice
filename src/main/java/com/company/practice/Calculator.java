package com.company.practice;

import java.util.Scanner;

/**
 * Created by Woody on 2016/7/19.
 */
public class Calculator {
    public static void main(String args[]) {
        System.out.println("----------------------------------------------");
        System.out.println("请输入一个四则运算的表达式，例如45*23或者6/3：");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuffer buffer = new StringBuffer();
        StringBuffer buffer1 = new StringBuffer();
        char t = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                t = str.charAt(i);
                for (int j = i + 1; j < str.length(); j++) {
                    buffer1.append(str.charAt(j));
                }
                break;
            } else {
                buffer.append(str.charAt(i));
            }
        }
        String c = buffer.toString();
        String d = buffer1.toString();
        double a = Double.parseDouble(c);
        double b = Double.parseDouble(d);
        double sum = 0;
        if (t == '+') {
            sum = a + b;
        }
        if (t == '-') {
            sum = a - b;
        }
        if (t == '*') {
            sum = a * b;
        }
        if (t == '/') {
            sum = a / b;
        }
        System.out.println("程序计算");
        System.out.println(c + t + d + "=" + sum);
        System.out.println("----------------------------------------------");
    }
}
