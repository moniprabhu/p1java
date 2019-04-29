package com.stackroute.p1;
import java.util.*;
public class VowelOrConsontant {
   private  String  str1;

        public String findVowelConst (String str){
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                {
                    str1="vowels";
                } else
                    {
                    str1="consontants";
                }

            }

        return str1;
}}
