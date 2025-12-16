import java.util.*;
class VolumeCylinder {
public static double VolumeOfCylinder(double r, double h){
return Math.PI*r*r*h;
}
public static void main(String[]args){
Scanner kb=new Scanner(System.in);
double rad=kb.nextDouble();
double height=kb.nextDouble();
System.out.println("Volume Of Cylinder "+VolumeOfCylinder(rad,height));


}
}