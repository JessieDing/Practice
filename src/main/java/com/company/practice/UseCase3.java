package com.company.practice;

/**
 * Created by Woody on 2016/8/9.
 */
public class UseCase3 {
    private float height;
    private float width;

    public UseCase3(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float square() {
        return height * width;
    }

    public static void main(String[] args) {    //例子中写的的(String args[])？？
        UseCase3 u = new UseCase3(3.5f, 4.5f);
        System.out.println(u.square());
    }
}
