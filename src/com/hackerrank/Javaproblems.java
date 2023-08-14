package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

    public void fizzBuzz(int n) {
        for (int i = 1; i<=n; i++){
            if(i%3!=0 && i%5!=0){
                System.out.println(i);
            }
            if(i%3==0 && i%5!=0){
                System.out.println("Fizz");
            }
            if(i%3!=0 && i%5==0){
                System.out.println("Buzz");
            }
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }

        }

    }

    public void verify_String(){
        String A = "hello";
        String B = "java";

        System.out.println(A.length()+B.length());
        //System.out.println(mys1.compareTo(mys2));
        if (A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
        
    }

    public void String_Review(){

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i<T; i++){
            String input = scan.next();
            String_Review2(input);
        }
        scan.close();
    }

    public void String_Review2(String string){

        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for(int i = 0; i<string.length(); i++){
            if(i%2==0){
                even.append(string.charAt(i));
            }
            else {
                odd.append(string.charAt(i));
            }
        }
        System.out.println(even +" "+ odd);
    }

    public void String_Review3(String string){

        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for(int i = 0; i<string.length(); i++){
            if(i%2==0){
                even.append(string.charAt(i));
            }
            else {
                odd.append(string.charAt(i));
            }
        }
        System.out.println(even +" "+ odd);
    }

    public void reverseArray(){
        List<Integer> list1 = new ArrayList<>(4);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);
        String arr="";
        for (int i : list1){
            System.out.print(i+" ");
        }
        //System.out.println(arr);
    }

    public void Map_dictionary(){

    }

    public void findXOR(){
        int i = 11 ;
        int j = 100 ;
        int result= i^j;

        int result2 = Integer.max(i^j, j^i);
        System.out.println("the findXOR is: "+result);
        System.out.println("the findXOR2 is: "+result2);
    }



}
