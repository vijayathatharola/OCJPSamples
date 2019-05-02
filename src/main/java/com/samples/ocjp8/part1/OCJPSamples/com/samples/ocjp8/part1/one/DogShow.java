package com.samples.ocjp8.part1.OCJPSamples.com.samples.ocjp8.part1.one;

public class DogShow {
    public static void main(String[] args){
        new DogShow().go();
    }
    void go(){
        new Hound().bark();
        ((Dog)new Hound()).bark();

        //((Dog)new Hound()).sniff();

    }
}
