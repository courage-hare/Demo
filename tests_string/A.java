package com.hare.tests_string;

import java.util.Arrays;

public class A {
    private static char[] a = {'H','e','l','l','o',' ','H','a','r','e',' ','!',' '};

    static{
        System.out.println(Arrays.toString(a));
    }

    public A() {

    }

    public char[] getA() {
        return a;
    }
}
