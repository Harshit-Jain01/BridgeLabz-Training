import java.util.Scanner;

public class BMICalculation{

    // calculate BMI and Status for one person
    public static String[] findBmi(double weight,double heightCm){
        double ht=heightCm/100;
        double bmi=weight/(ht*ht);
        bmi=Math.round(bmi*100.0)/100.0;
        String status;

        if(bmi<=18.4)
            status="Underweight";
        else if(bmi>=18.5&&bmi<=24.9)
            status="Normal";
        else if(bmi>=25.0&&bmi<=39.9)
            status="Overweight";
        else
            status="Obese";

        return new String[]{String.valueOf(bmi),status};
    }

    //2D String array 
    public static String[][] bmiReport(double[][] data){

        int persons=data.length;
        String[][] result=new String[persons][4];

        for(int i=0;i<persons;i++){
            double weight=data[i][0];
            double height=data[i][1];

            String[] bmiData=findBmi(weight,height);

            result[i][0]=String.valueOf(height);
            result[i][1]=String.valueOf(weight);
            result[i][2]=bmiData[0];
            result[i][3]=bmiData[1];
        }
        return result;
    }

    // BMI report 
    public static void displayReport(String[][] report){

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("------------------------------------------------");

        for(int i=0;i<report.length;i++){
            System.out.println(
                report[i][0]+"\t\t"+
                report[i][1]+"\t\t"+
                report[i][2]+"\t"+
                report[i][3]
            );
        }
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        // 2D array
        double[][] data=new double[10][2];

        System.out.println("Enter Weight,Height of 10 persons:");

        for(int i=0;i<10;i++){
            System.out.println("Person "+(i+1)+":");
            System.out.print("Weight");
            data[i][0]=input.nextDouble();

            System.out.print("Height");
            data[i][1]=input.nextDouble();
        }

        String[][] report=bmiReport(data);
        displayReport(report);

        input.close();
    }
}
