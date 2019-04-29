package com.stackroute.p1;

import java.util.Scanner;

public class GuessingNumber {
    private int n;
   private String str1;
    public String  numberTOGuess ( int n){
        int number=n;
        if (number >= 1 && number <= 50)
        {
          str1= "Number guessed matches the original number";
        } else if (number < 1)
        {
            str1="Number guessed is less than the original number";
        } else
            {
            str1="Number guessed is more than the original number";
        }
       return str1;
    }

}

