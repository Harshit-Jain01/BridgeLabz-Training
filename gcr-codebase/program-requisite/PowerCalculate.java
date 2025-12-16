import java.util.*;
class PowerCalculate{
public static double powerCal(int b, int e){
return Math.pow(b,e);
}
public static void main(String[]args){
Scanner kb=new Scanner(System.in);
int base=kb.nextInt();
int exp=kb.nextInt();
System.out.println(Math.pow(base,exp));

}
}