package com.stackroute.p1;

import java.util.Scanner;

public class StackRoute {
    public static void main(String args[]) {
        String str, new_word;
        int valueMulti, i, len;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        str = in.next();
        new_word = str;
        System.out.println("enter multiplier value");
        valueMulti = in.nextInt();
        len = str.length();
        System.out.println(len);
        for (i = 0; i < valueMulti; i++) {
            new_word = new_word + str.substring(len - valueMulti, len);
        }
        System.out.println(new_word);
    }

}
