package com.samples.ocjp8.part1.one;

public class IfaceTest implements Myinterface {
    public static void main(String[] args){
        new IfaceTest().go();
    }

    void go(){
        Myinterface.super.doStuff();
    }
    public int doStuff(){
        return 43;
    }
}

interface Myinterface{
    default int doStuff(){
        return 42;
    }
}
