package com.ksultan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");
	    Scanner input = new Scanner(System.in);
        System.out.println("Enter an number");
	    String a = input.next();
	    int aNumber=Integer.valueOf(a);
        System.out.println("Enter another number");
        String b = input.next();
        int bNumber=Integer.valueOf(b);
        System.out.println("The sum of the numbers is: ");
        System.out.println(add(aNumber,bNumber));
    }

    private static int add(int a, int b) {
        return a+b;
    }
}
