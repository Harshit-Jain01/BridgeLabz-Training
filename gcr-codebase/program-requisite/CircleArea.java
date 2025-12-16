import java.util.*;
class CircleArea {
public static  double AreaofCircle(double r){
return Math.PI*r*r;
}  
public static void main(String[]args){
Scanner kb=new Scanner(System.in);
double d=kb.nextDouble();
System.out.println("Area of circle is " +AreaofCircle(d));

}
}
