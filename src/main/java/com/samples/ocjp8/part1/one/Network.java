package com.samples.ocjp8.part1.one;

public class Network {
    Network(int x,Network n){
        id=x;
        p=this;
        if (n!=null) p = n;
    }
    int id;
    Network p;
    public static void main(String[] args){
        Network n1= new Network(1,null);
        n1.go(n1);
    }
    void go(Network n1){
        Network n2 = new Network(2,null);
        Network n3 = new Network(3,n2);
        System.out.println(n3.p.p.id);
    }
}
