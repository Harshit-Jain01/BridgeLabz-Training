import java.util.Scanner;

class Matrix{

    //create random matrix
    public static int[][] randomMatrix(int rows,int cols){
        int[][] matrix=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=(int)(Math.random()*10); 
            }
        }
        return matrix;
    }

    //add matrices
    public static int[][] addMatrix(int[][] A,int[][] B){
        int rows=A.length;
        int cols=A[0].length;
        int[][] sum=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
        return sum;
    }

    //subtract matrices
    public static int[][] subtractMatrix(int[][] A,int[][] B){
        int rows=A.length;
        int cols=A[0].length;
        int[][] diff=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                diff[i][j]=A[i][j]-B[i][j];
            }
        }
        return diff;
    }

    //multiply matrices
    public static int[][] multiplyMatrix(int[][] A,int[][] B){
        int rows=A.length;
        int cols=B[0].length;
        int common=B.length;

        int[][] product=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                for(int k=0;k<common;k++){
                    product[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return product;
    }

    //method to display matrix
    public static void displayMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter rows and columns for Matrix A");
        int r1=input.nextInt();
        int c1=input.nextInt();

        System.out.println("Enter rows and columns for Matrix B");
        int r2=input.nextInt();
        int c2=input.nextInt();

        int[][] A=randomMatrix(r1,c1);
        int[][] B=randomMatrix(r2,c2);

        System.out.println("\nMatrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        if(r1==r2 && c1==c2){
            System.out.println("\nAddition:");
            displayMatrix(addMatrix(A,B));

            System.out.println("\nSubtraction:");
            displayMatrix(subtractMatrix(A,B));
        } else {
            System.out.println("\nAddition and Subtraction not possible");
        }

        if(c1==r2){
            System.out.println("\nMultiplication:");
            displayMatrix(multiplyMatrix(A,B));
        } else {
            System.out.println("\nMultiplication not possible");
        }

        input.close();
    }
}
