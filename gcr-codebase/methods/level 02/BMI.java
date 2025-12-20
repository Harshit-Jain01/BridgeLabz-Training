import java.util.Scanner;

public class BMI{

    //calculate BMI and store in array
    public static void calculateBMI(double[][] data){
        for(int i=0;i<10;i++){
            double height=data[i][1]/100;
            data[i][2]=data[i][0]/(height*height);
        }
    }

    // BMI status
    public static String getStatus(double bmi){
        if(bmi<=18.4)
            return "Underweight";
        else if(bmi>=18.5&&bmi<=24.9)
            return "Normal";
        else if(bmi>=25.0&&bmi<=39.9)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args){

        Scanner kb=new Scanner(System.in);
        double[][] arr=new double[10][3];
        String[] status=new String[10];

        //input weight and height
        for(int i=0;i<10;i++){
            System.out.println("Enter weight"+(i+1));
            arr[i][0]=kb.nextDouble();

            System.out.println("Enter height"+(i+1));
            arr[i][1]=kb.nextDouble();
        }

        //calculate bmi
        calculateBMI(arr);

        //find status
        for(int i=0;i<10;i++){
            status[i]=getStatus(arr[i][2]);
        }

        //display result
        System.out.println("Weight  Height   BMI   Status");
        for(int i=0;i<10;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]+" "+status[i]);
        }

        kb.close();
    }
}
