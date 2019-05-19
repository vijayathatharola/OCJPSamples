package com.samples.ocjp8.part1.five;

public class Gotcha {
    public static void main(String[] args) {
        try {
            new Gotcha().go();
        }catch(Exception e){
            System.out.println("EXC" + e);

        }
    }
    void go() {
        System.out.println("Ressdsdssf");
    }
    }
