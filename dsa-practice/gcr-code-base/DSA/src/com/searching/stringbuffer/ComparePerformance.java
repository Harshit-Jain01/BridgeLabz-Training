package com.searching.stringbuffer;

import java.util.Arrays;
import java.util.Scanner;

public class ComparePerformance {

    public static long bufferTime(String s){
        StringBuffer buffer=new StringBuffer();
        long start=System.nanoTime();
        for(int i=0;i<100000;i++){
            buffer.append(s);
        }
        long end=System.nanoTime();
        return end-start;
    }

    public static long builderTime(String s){
        StringBuilder builder=new StringBuilder();
        long start=System.nanoTime();
        for(int i=0;i<100000;i++){
            builder.append(s);
        }
        long end=System.nanoTime();
        return end-start;
    }

    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=kb.nextLine();

        long builderTime=builderTime(s);
        long bufferTime=bufferTime(s);

        System.out.println("StringBuilder Time:"+builderTime+" ns");
        System.out.println("StringBuffer Time:"+bufferTime+" ns");

        if(builderTime<bufferTime)
            System.out.println("StringBuilder is faster");
        else
            System.out.println("StringBuffer is faster");

        kb.close();
    }
}
