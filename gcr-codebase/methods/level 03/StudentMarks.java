import java.util.Scanner;

class StudentMarks{

    //generate random PCM marks
    public static int[][] generateMarks(int students){
        int[][] marks=new int[students][3];

        for(int i=0;i<students;i++){
            marks[i][0]=10+(int)(Math.random()*90); 
            marks[i][1]=10+(int)(Math.random()*90); 
            marks[i][2]=10+(int)(Math.random()*90); 
        }
        return marks;
    }

    //calculate total, average and percentage
    public static double[][] calculateResult(int[][] marks){
        int students=marks.length;
        double[][] result=new double[students][3];

        for(int i=0;i<students;i++){
            double total=marks[i][0]+marks[i][1]+marks[i][2];
            double average=total/3;
            double percentage=(total/300)*100;

            //round off to 2 digits
            total=Math.round(total*100.0)/100.0;
            average=Math.round(average*100.0)/100.0;
            percentage=Math.round(percentage*100.0)/100.0;

            result[i][0]=total;
            result[i][1]=average;
            result[i][2]=percentage;
        }
        return result;
    }

    //method to display scorecard
    public static void displayScoreCard(int[][] marks,double[][] result){
        System.out.println("Std\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for(int i=0;i<marks.length;i++){
            System.out.println(
                (i+1)+"\t"+
                marks[i][0]+"\t"+
                marks[i][1]+"\t\t"+
                marks[i][2]+"\t"+
                result[i][0]+"\t"+
                result[i][1]+"\t"+
                result[i][2]
            );
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number of students");
        int students=input.nextInt();

		
        int[][] marks=generateMarks(students);
        double[][] result=calculateResult(marks);
		
		//display result
        displayScoreCard(marks,result);

        input.close();
    }
}
