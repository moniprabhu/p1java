package com.stackroute.p1;

import java.util.Scanner;

public class Palindrome {

        private long n;
        String str;
        public String checking(long n)
        {
            long r,sum=0,temp,add=0;
            temp=n;
            while(n>0){
                r=n%10;
                sum=(sum*10)+r;
                n=n/10;
                if(r%2==0)
                    add=add+r;
            }
            if((temp==sum)&&(add>25))
                str="it is palindrome and the sum of even numbers is greater than 25";
            else if ((temp == sum) && (add<25))
            {
                str= "it is a palindrome and the sum of even number is less than 25";
            }
            else
            { str=" it is not a palindrome";
            }
return str;

        }}

