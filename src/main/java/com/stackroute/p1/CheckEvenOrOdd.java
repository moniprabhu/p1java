package com.stackroute.p1;

import java.util.Scanner;

public class CheckEvenOrOdd {
    private String str;


    public String evenOrOdd(int n) {

        if (n % 2 == 0 && n > 20 && n <30) {

            str = "jerry";
        } else if (n % 2 != 0 && (n >20 && n <30)) {

            str = "tom";
        } else {
            str = "neither tom nor jerry";
        }

return str;
    }
}