package com.company;
//method overloading


public class Main {

    public  static int sra(int a) { return 10; }
    public  static char sra(int a, int b) { return 'a'; }

    public static void main(String args[])
    {

        System.out.println(sra(1));
        System.out.println(sra(1, 2));
    }
}