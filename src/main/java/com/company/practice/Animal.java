package com.company.practice;

/**
 * Created by Woody on 2016/8/9.
 */

class Animal {

    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        return this.name == ((Animal) obj).name && this.age == ((Animal) obj).age;
    }

    void eat() {
        System.out.print("meat");
    }

    void run() {
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.print("fish");
    }

    void tiao() {

    }
}

class Dog extends Animal {

}

class Pig extends Animal {

}

class TiaoCat extends Cat {

    TiaoCat() {

    }//构造方法（函数），初始化该类，只进一次，可传参，无返回值

    @Override
    void eat() {
        super.eat();
        System.out.print("mouse");
    }

    public static void main(String[] args) {
        Animal tiaoCat = new TiaoCat();
        Animal dog = new Dog();
        Animal pig = new Pig();//多态

    }

    void method1(Animal animal) {
        animal.eat();
    }
}
