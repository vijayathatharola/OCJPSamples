package com.samples.ocjp8.part1.four;

public class Spock {
    public static void main(String[] args){
        int mask =0;
        int count =0;
        if ( ((5<7) || (++count<10) ) | mask++ <10 )  mask = mask +1;
        if ( (6>8) ^ false)     mask = mask+10;
        if ( !(mask>1)  && ++count >1)  mask = mask+100;
        System.out.println(mask + " " + count);

        boolean b1 = false ;
        boolean b2 ;
        int x=2,y=5;
        b1 =2-12/4 > 5+-7 && b1 != y++>5 == 7%4 > ++x | b1 ==true;
        System.out.println("b1 " + b1);

        b2 =(2-12/4 > 5+-7) && (b1 != y++>5) == (7%4 > ++x) | b1 ==true;
        System.out.println("b2 " + b2);


    }
}
