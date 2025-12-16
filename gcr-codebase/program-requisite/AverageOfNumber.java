import java.util.*;
class AverageOfNumber{
public static double AverageOfThreeNumber(int a, int b,int c){
return (a+b+c)/3;
}
public static void main(String[]args){
Scanner kb=new Scanner(System.in);
int a=kb.nextInt();
int b=kb.nextInt();
int c=kb.nextInt();
System.out.println(AverageOfThreeNumber(a,b,c));
}
}