package com.samples.ocjp8.part1.one;

// If Sing() method is not Static then fa fa is printed
// If Sing() is STATIC Methods then its a class method - Parent Child casted to Child then it is of type parent.
public class Tenor extends Singer {
    public static String sing(){
        return "fa";
    }
    public static void main(String[] args){
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }

}
class Singer {
    public static String sing() {

        return ("la");
    }
}