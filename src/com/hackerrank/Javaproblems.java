package com.hackerrank;

import java.util.Scanner;

public class Javaproblems {

    public void Java_String_Introduction(){

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();

            int length_a = A.length();
            int length_b = B.length();

            System.out.println(length_a+length_b);
            if(length_a>length_b){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
            String s1 = A.substring(0, 1).toUpperCase() + A.substring(1);
            String s2 = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(s1+" "+s2);


    }
}
