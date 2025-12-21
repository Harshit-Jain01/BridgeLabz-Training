import java.util.Scanner;

class EuclideanDistance{

    //find Euclidean distance
    public static double findDistance(double x1,double y1,double x2,double y2){
        double distance=Math.sqrt( Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        
        return distance;
    }

    //slope and y-intercept
    public static double[] lineEquation(double x1,double y1,double x2,double y2){
        double m=(y2-y1)/(x2-x1);
        double b=y1-(m*x1);

        double[] result=new double[2];
        result[0]=m; //slope
        result[1]=b; //y-intercept

        return result;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        //taking input for points
        System.out.println("Enter x1 and y1");
        double x1=input.nextDouble();
        double y1=input.nextDouble();

        System.out.println("Enter x2 and y2");
        double x2=input.nextDouble();
        double y2=input.nextDouble();

        //distance calculation
        double distance=findDistance(x1,y1,x2,y2);
        System.out.println("Euclidean Distance = "+distance);

        //line equation calculation
        double[] line=lineEquation(x1,y1,x2,y2);
        double m=line[0];
        double b=line[1];

        System.out.println("Slope (m) = "+m);
        System.out.println("Y-Intercept (b) = "+b);
        System.out.println("Equation of Line : y = "+m+"x + "+b);

        input.close();
    }
}
