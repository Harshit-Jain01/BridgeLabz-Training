import java.util.*;

public class LC54_SpiralMatrix{

    // static method
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0, bottom = row - 1;
        int left = 0, right = col - 1;
        int total = row * col;
        int count = 0;

        while (count < total) {

            // left to right
            for (int i = left; i <= right && count < total; i++) {
                list.add(matrix[top][i]);
                count++;
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom && count < total; i++) {
                list.add(matrix[i][right]);
                count++;
            }
            right--;

            // right to left
            for (int i = right; i >= left && count < total; i--) {
                list.add(matrix[bottom][i]);
                count++;
            }
            bottom--;

            // bottom to top
            for (int i = bottom; i >= top && count < total; i--) {
                list.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return list;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);

        sc.close();
    }
}
