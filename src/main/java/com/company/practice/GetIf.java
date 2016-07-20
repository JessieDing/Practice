package com.company.practice;

import java.util.Scanner;

/**
 * Created by Woody on 2016/7/5.
 */
public class GetIf {
    public static void main(String[] args) {
        System.out.println("请输入0到10中的任意一个数字");//如何连续输入？
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x > 0 && x < 5) {
            System.out.println("该值大于0但小于5");
        } else if (x > 5 && x < 10) {
            System.out.println("该值大于5但小于10");
        } else if(x == 0){
            System.out.println("该值为0");
        } else if(x == 5) {
            System.out.println("该值为5");
        } else if (x == 10){
            System.out.println("该值为10");
        } else{}
    }
}
