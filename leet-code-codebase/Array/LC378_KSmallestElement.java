import java.util.Arrays;

class LC378_KSmallestElement{

    public static int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;
        int[] brr = new int[n * n];
        int i = 0;

        for (int[] arr : matrix) {
            for (int x : arr) {
                brr[i++] = x;
            }
        }

        Arrays.sort(brr);
        return brr[k - 1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        int result = kthSmallest(matrix, k);
        System.out.println("Kth smallest element: " + result);
    }
}
