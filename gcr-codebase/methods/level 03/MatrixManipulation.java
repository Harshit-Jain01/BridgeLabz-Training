import java.util.Scanner;

class MatrixManipulation{

    //create random matrix
    public static double[][] randomMatrix(int rows,int cols){
        double[][] matrix=new double[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=(int)(Math.random()*9)+1; //1 to 9
            }
        }
        return matrix;
    }

    // find transpose
    public static double[][] transposeMatrix(double[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        double[][] transpose=new double[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }

    //determinant of 2x2 matrix
    public static double determinant2x2(double[][] m){
        return (m[0][0]*m[1][1])-(m[0][1]*m[1][0]);
    }

    //determinant of 3x3 matrix
    public static double determinant3x3(double[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    //inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m){
        double det=determinant2x2(m);
        double[][] inv=new double[2][2];

        inv[0][0]= m[1][1]/det;
        inv[0][1]=-m[0][1]/det;
        inv[1][0]=-m[1][0]/det;
        inv[1][1]= m[0][0]/det;

        return inv;
    }

    //inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m){
        double det=determinant3x3(m);
        double[][] inv=new double[3][3];

        inv[0][0]=(m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1]=(m[0][2]*m[2][1]-m[0][1]*m[2][2])/det;
        inv[0][2]=(m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;

        inv[1][0]=(m[1][2]*m[2][0]-m[1][0]*m[2][2])/det;
        inv[1][1]=(m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2]=(m[0][2]*m[1][0]-m[0][0]*m[1][2])/det;

        inv[2][0]=(m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1]=(m[0][1]*m[2][0]-m[0][0]*m[2][1])/det;
        inv[2][2]=(m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;

        return inv;
    }

    //method to display matrix
    public static void displayMatrix(double[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter matrix size (2 or 3)");
        int n=input.nextInt();

        double[][] matrix=randomMatrix(n,n);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix));

        if(n==2){
            double det=determinant2x2(matrix);
            System.out.println("\nDeterminant = "+det);

            if(det!=0){
                System.out.println("\nInverse:");
                displayMatrix(inverse2x2(matrix));
            } else
                System.out.println("Inverse not possible");
        }

        if(n==3){
            double det=determinant3x3(matrix);
            System.out.println("\nDeterminant = "+det);

            if(det!=0){
                System.out.println("\nInverse:");
                displayMatrix(inverse3x3(matrix));
            } else
                System.out.println("Inverse not possible");
        }

        input.close();
    }
}
