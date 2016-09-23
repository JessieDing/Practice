package com.company.practice;

/**
 * Created by Woody on 2016/9/8.
 */
public class NumException extends Exception{
    public NumException(String ErrorMessage){
        super(ErrorMessage);
    }
    static int avg(int number1, int number2) throws NumException {
        if (number1 < 0 || number2 < 0){
            throw new NumException("不可以使用负数");
        }
        if(number1<100||number2>100){
            throw new NumException("数值太大了");
        }
        return(number1+number2)/2;
    }
    public static void main(String[] args){
        try{
            int result = avg(102,150);
            System.out.println(result);
        }catch(NumException e){
            System.out.println(e);
        }
    }
}
