package com.day6.icecreamrush;

public class BubbleSortFlavors {

    public static void bubbleSort(IceCreamFlavor[] flavors){
        int n=flavors.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(flavors[j].sales<flavors[j+1].sales){
                    IceCreamFlavor temp=flavors[j];
                    flavors[j]=flavors[j+1];
                    flavors[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args){

        IceCreamFlavor[] flavors={
            new IceCreamFlavor("Vanilla",120),
            new IceCreamFlavor("Chocolate",200),
            new IceCreamFlavor("Strawberry",90),
            new IceCreamFlavor("Mango",150),
            new IceCreamFlavor("Butterscotch",110),
            new IceCreamFlavor("Pista",80),
            new IceCreamFlavor("Blueberry",60),
            new IceCreamFlavor("Coffee",140)
        };

        System.out.println("Before Sorting:");
        for(IceCreamFlavor f:flavors){
            System.out.println(f);
        }

        bubbleSort(flavors);

        System.out.println("\nAfter Sorting by Popularity:");
        for(IceCreamFlavor f:flavors){
            System.out.println(f);
        }
    }
}
