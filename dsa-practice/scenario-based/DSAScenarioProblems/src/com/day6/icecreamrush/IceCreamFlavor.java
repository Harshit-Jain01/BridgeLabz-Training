package com.day6.icecreamrush;

public class IceCreamFlavor {
    public String name;
    public int sales;

    public IceCreamFlavor(String name,int sales){
        this.name=name;
        this.sales=sales;
    }

    @Override
    public String toString(){
        return name+" (Sales:"+sales+")";
    }
}
