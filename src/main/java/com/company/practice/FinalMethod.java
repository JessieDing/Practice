package com.company.practice;

class Parents {
    private final void doit() {
        System.out.println("父类.doit()");
    }

    final void doit2() {
        System.out.println("父类.doit2()");
    }

    public void doit3() {
        System.out.println("父类.doit3()");
    }
}

class Sub extends Parents {
    public final void doit() { //此处是public，Parents类中doit方法为private
        System.out.print("子类.doit()"); //？？这里用的是否Parents类中定义为final的doit方法
    }

    //final void doit2(){             //final方法不能覆盖（重写？）
    //    System.out.println("子类.doit2()");
    //}
    public void doit3() {
        System.out.println("子类.doit3()");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.doit();
        Parents p = s;
        //p.doit();   // 不能调用private方法，？？
        p.doit2();
        p.doit3();
    }
}
