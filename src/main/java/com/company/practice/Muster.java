package com.company.practice;

import java.util.*;//??? * 处为Collection时下面的ArrayList会报错

/**
 * Created by Woody on 2016/9/8.
 */
public class Muster {
    public static void main(String args[]) {
        Collection<String> list = new ArrayList<>() ;//?书中没有用";"
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();// ??? String
            System.out.println(str);
        }
    }
}
