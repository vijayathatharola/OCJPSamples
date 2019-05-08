package com.samples.ocjp8.part1.one;

// "|" Validates both parameters and proceeds
// "||" Validates  parameters only on left side and proceeds

public class Dog {
    String name;

    Dog(String s) {
        name = s;
    }

    public static void main(String[] args) {
       Dog d1 = new Dog("Boi");
        Dog d2 = new Dog("Tyri");

        System.out.println((d1 == d2) + " ");

        Dog d3 = new Dog("Boi");
        d2 = d1;

        System.out.println((d1 == d2) + " ");
        System.out.println((d1 == d3) + " ");
        if ( (args.length == 1) | (args[1].equals("test")) ) {
            System.out.println("test case");

        } else {
            System.out.println("production " + args[0]);

        }
    }
}
