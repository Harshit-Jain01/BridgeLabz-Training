import java.util.*;

public class LC566_ArrayPairSum{

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        if (r * c != row * col || (row == r && col == c))
            return mat;

        int[] arr = new int[row * col];
        int h = 0;

        for (int[] a : mat) {
            for (int x : a) {
                arr[h++] = x;
            }
        }

        int[][] sap = new int[r][c];
        int l = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sap[i][j] = arr[l++];
            }
        }

        return sap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] mat = new int[row][col];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter new rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] result = matrixReshape(mat, r, c);

        System.out.println("Reshaped Matrix:");
        for (int[] a : result) {
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
