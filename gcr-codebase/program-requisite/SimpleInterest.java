import java.util.*;
class SimpleInterest{
public static double simpleInterest(double p, double r, double t){
return (p*r*t)/100;
}
public static void main(String[]args){
Scanner kb=new Scanner(System.in);
double p=kb.nextDouble();
double r=kb.nextDouble();
double t=kb.nextDouble();
if(p<0 || r<1 || t<1 )
System.out.println("Invalid input");
else
System.out.println("S.I. is "+simpleInterest(p,r,t));

}
}