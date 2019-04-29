package com.stackroute.p1;
import java.util.*;
import java.io.*;
public class Captial {

   char c;
   String s1;

        public String  capsOrSmall(char c){
            if(Character.isUpperCase(c)){
               s1=  " it is uppercase alphabet";
            }
            else if(Character.isLowerCase(c))
            {
               s1= " it is lowercase alphabet.";
            }
            else if(c >= '0' && c <= '9'){
                s1="it is a digit";
            }
            else{
                s1="special symbol";
            }

         return s1;
        }
}
