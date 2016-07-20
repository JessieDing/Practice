package com.company.practice;

/**
 * Created by Woody on 2016/7/15.
 */

import java.util.Date;

public class Eval {
    public static void main(String[] args) {
        Date date = new Date();
        String year = String.format("%tY", date);
        String month = String.format("%tB", date);
        String day = String.format("%td",date);
        System.out.println("今年是："+year+"年");
        System.out.println("现在是："+month);//不用加“月”字
        System.out.println("今天是："+day+"号");
    }
}
