package com.otto.hw2;


import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Executing Main");
        System.out.println("Printing initial string: " +str);
        System.out.println("Printing initial string reversed by Apache commons lib: "
                + StringUtils.reverse(str));
    }
}
