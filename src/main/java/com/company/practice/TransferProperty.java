package com.company.practice;


/**
 * 说明对象如何调用类成员，先用非静态成员变量，后将成员变量更改为static，如下
 * Created by Woody on 2016/8/1.
 */
public class TransferProperty {
    static int i = 47; //变量i为静态变量，与对象t1、t2无关

    public void call() {
        System.out.println("调用call（）方法");
        for (i = 0; i < 3; i++) {
            System.out.print(i + " ");
            if (i == 2) {
                System.out.println("\n");
            }
        }
    }

    public TransferProperty() {
    }

    public static void main(String[] args) {


        TransferProperty t1 = new TransferProperty();
        TransferProperty t2 = new TransferProperty();


        i = 60;
        System.out.println("第一个实例对象调用变量i的结果：" + i++);

        // 注：自增（自减）运算符，放在操作元后面，
        //会使变量先参与表达式的运算，然后再将该变量加1（减1），例如：
        //int a = 0
        //a = a++
        //System.out.println(a);
        //打印结果a=0
        //因为先将0赋给了a，而自增运算的结果并未赋给a

        System.out.println(i);
        t1.call();
        System.out.println(i);
        System.out.println("第二个实例对象调用变量i的结果：" + i);
        t2.call();
        System.out.println(i);

        //        之前，i为非静态变量，写法：t2.i = 60;  // 此时，i为静态变量，正确的写法：TransferProperty.i = 60;TransferProperty可省略，因为在该类中
//        System.out.println("第一个实例对象调用变量i的结果：" + t1.i++);
//        System.out.println(t1.i );
//        t1.call();
//        System.out.println(t1.i );
//        System.out.println("第二个实例对象调用变量i的结果：" + t2.i);
//        t2.call();
//        System.out.println(t2.i );

    }
}


