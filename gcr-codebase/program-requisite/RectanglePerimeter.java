import java.util.*;
class RectanglePerimeter{
public static double periOfRectangle(double l, double b){
return 2*(l+b);
}
public static void main(String[]args){
Scanner kb=new Scanner(System.in);
double len=kb.nextDouble();
double br=kb.nextDouble();
System.out.println(periOfRectangle(len,br));

}
}