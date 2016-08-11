package com.company.practice;

/**
 * Created by Woody on 2016/8/10.
 */
public class RandomTest {
    public static int GetEvenNum(double num1, double num2) {     //为什么不用double？
        int sum = 0;
        for (int i = 1; i < 7; i++) {
            int s = (int) num1 + (int) (Math.random() * (num2 - num1));
            if (s % 2 == 0)
            {
                System.out.println("第"+i+"个随机数："+s);
                sum+=s;
            }
            else{
                System.out.println("第"+i+"个随机数："+(s+1));
                sum+=(s+1);
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("2到32之间随机6个偶数的和："+GetEvenNum(2,32));
    }
}
