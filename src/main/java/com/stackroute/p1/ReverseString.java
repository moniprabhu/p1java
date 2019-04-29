package com.stackroute.p1;

import java.util.Scanner;

public class ReverseString {

        String rev = "";

public String reverse(String str){

        int length = str.length();

        for (int i = length - 1 ; i >= 0 ; i--)
        rev = rev+ str.charAt(i);

return(rev);
    }
}


