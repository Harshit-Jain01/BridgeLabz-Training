import java.util.*;
class BonusOfEmployees{
   public static void main(String []args){

          Scanner input= new Scanner(System.in);
      	  int totalEmployees=10;
          
        //declaring double array 
         double salary[] =new double[10];
         double yearsOfService[] =new double[10];
         double[] bonus = new double[totalEmployees];
         double[] newSalary = new double[totalEmployees];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

       //taking input for 10 of the employees
        for(int i=0;i<10;i++){
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.println("Enter Salary:");
            double sal = input.nextDouble();
            System.out.println("Enter years of service:");
            double years = input.nextDouble();
           if (sal <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; 
                continue;
            }
           salary[i]=sal;
           yearsOfService[i]=years;
        }

        for(int i=0; i<10;i++){
           if (yearsOfService[i] > 5) {
                bonus[i] = (salary[i]*5)/100; 
            } else {
                bonus[i] = (salary[i]*2)/100; 
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
	
	//displaying the result
        System.out.println("Total Old Salary-" + totalOldSalary);
        System.out.println("Total Bonus Paid-" + totalBonus);
        System.out.println("Total New Salary-" + totalNewSalary);

        input.close();
         
    }
}