import java.util.Scanner;

class CollinearPoints{

    //collinearity using slope formula
    public static boolean isCollinearBySlope(int x1,int y1,int x2,int y2,int x3,int y3){

        return (y2-y1)*(x3-x2)==(y3-y2)*(x2-x1)
            && (y3-y1)*(x2-x1)==(y2-y1)*(x3-x1);
    }

    //collinearity using area of triangle formula
    public static boolean isCollinearByArea(int x1,int y1,int x2,int y2,int x3,int y3){

        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        return area==0;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter x1 y1:");
        int x1=input.nextInt();
        int y1=input.nextInt();

        System.out.println("Enter x2 y2:");
        int x2=input.nextInt();
        int y2=input.nextInt();

        System.out.println("Enter x3 y3:");
        int x3=input.nextInt();
        int y3=input.nextInt();

        if(isCollinearBySlope(x1,y1,x2,y2,x3,y3))
            System.out.println("Points are collinear using slope method");
        else
            System.out.println("Points are not collinear using slope method");

        if(isCollinearByArea(x1,y1,x2,y2,x3,y3))
            System.out.println("points are collinear using area method");
        else
            System.out.println("points are not collinear using area method");

        input.close();
    }
}
