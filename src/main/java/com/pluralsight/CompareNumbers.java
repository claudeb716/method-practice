package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner greetScanner = new Scanner(System.in);
        System.out.println("Choose A Greeting to say: Hello(1), Goodbye(2), Good Morning(3)");

        int sayHi = greetScanner.nextInt();
        if sayHi == 1) {
    hello(greetScanner);
        }
    }
    public static void hello(Scanner hi){
        System.out.println("Hello");
    }
}
