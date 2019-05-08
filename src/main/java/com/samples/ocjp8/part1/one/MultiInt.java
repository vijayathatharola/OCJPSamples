package com.samples.ocjp8.part1.one;

public class MultiInt implements I1,I2 {

    public static void main(String[] args){
        new MultiInt().go();
    }
    void go(){
        System.out.println(doStuff());
        System.out.println(I2.super.doStuff());

    }
    public int doStuff(){
        return 3;

    }
}

interface I1{
default int doStuff(){
    return 1;
}
}

interface I2{
    default int doStuff(){
        return 2;
    }
}
