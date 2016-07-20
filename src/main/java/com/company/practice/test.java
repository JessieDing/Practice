package com.company.practice;

/**
 * Created by Woody on 2016/6/30.
 */
public class test {
    public static void main(String[] args) {
        int a = 0;
        a = a++;
        System.out.println(a);
        a = ++a;
        System.out.println(a);

        int i = 0;
        int j = i++ + ++i;
        int k = --i + i--;
        System.out.println(a);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
