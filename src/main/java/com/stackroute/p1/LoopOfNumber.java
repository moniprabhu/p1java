package com.stackroute.p1;

import java.util.Scanner;

public class LoopOfNumber {

        public static void main(String args[]) {
            int num;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            num = sc.nextInt();
            Iteration(num);

        }
        public static void Iteration(int num){
            int number=num;
            int i,j;
            for(i=1;i<=number;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(i);
                }

            }
        }
    }

