import java.util.*;

class LC189_RotateArray{

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return;

        if (k > n)
            k = k % n;

        int[] brr = new int[n];
        int j = n - 1;

        for (int i = k - 1; i >= 0; i--) {
            brr[i] = arr[j--];
        }

        for (int i = k; i < n; i++) {
            brr[i] = arr[i - k];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = brr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        rotate(arr, k);

        System.out.println("Rotated Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
