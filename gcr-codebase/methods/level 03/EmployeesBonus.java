import java.util.*;

class EmployeesBonus{

    //generate salary and years of service
    public static double[][] generateEmployeeData(int employees){
        double[][] data=new double[employees][2];

        for(int i=0;i<employees;i++){
            data[i][0]=10000+(Math.random()*90000);
            data[i][1]=1+(int)(Math.random()*10);
        }
        return data;
    }

    //calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data){
        int employees=data.length;
        double[][] result=new double[employees][2];

        for(int i=0;i<employees;i++){
            double salary=data[i][0];
            double years=data[i][1];
            double bonus;

            if(years>5)
                bonus=salary*0.05;
            else
                bonus=salary*0.02;

            result[i][0]=bonus;              //bonus
            result[i][1]=salary+bonus;       //new salary
        }
        return result;
    }

    //calculate totals and display table
    public static void displayResult(double[][] data,double[][] result){
        double totalOldSalary=0;
        double totalNewSalary=0;
        double totalBonus=0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for(int i=0;i<data.length;i++){
            double oldSalary=data[i][0];
            double years=data[i][1];
            double bonus=result[i][0];
            double newSalary=result[i][1];

            totalOldSalary+=oldSalary;
            totalNewSalary+=newSalary;
            totalBonus+=bonus;

            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n",
                    (i+1),oldSalary,years,bonus,newSalary);
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t%.2f\t%.2f\n",
                totalOldSalary,totalBonus,totalNewSalary);
    }

    public static void main(String[] args){
        int employees=10;

        double[][] data=generateEmployeeData(employees);
        double[][] result=calculateBonus(data);
        displayResult(data,result);
    }
}
