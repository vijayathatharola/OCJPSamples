package com.samples.ocjp8.part1.one;

// If method is static then Mammal m = new Zebra(); m.method will call parent method
// If method is NOT static then Mammal m = new Zebra(); m.method will call child method

//Variable is always calling super method.

public class ZooKeeper {
    public static void main(String[] args){
        new ZooKeeper().go();
    }
    void go(){
        Mammal m = new Zebra();
        System.out.println( m.name + " " + m.makeNoise());
    }
}

class Mammal {
     String name = "furry";
     String makeNoise(){
        return "generic Noise";
    }
}

class Zebra extends Mammal {
    String name = "stripes";
     String makeNoise(){
        return "bray";
    }
}
