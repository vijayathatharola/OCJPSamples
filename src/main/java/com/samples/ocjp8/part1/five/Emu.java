package com.samples.ocjp8.part1.five;

public class Emu {
    static String s="-";
    public static void main(String[] args){
        try{
            throw new Exception();
        }catch(Exception e){
            try{
                try{
                    throw new Exception();
                }catch(Exception ex){
                    s +="ic";
                }
                throw new Exception();
            }catch(Exception x){

            }finally {
                s += "mf";
            }
        }finally{
            s +="of";
        }
        System.out.println("S    " + s);
    }
}
