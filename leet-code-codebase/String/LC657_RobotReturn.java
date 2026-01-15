import java.util.Scanner;

class LC657_RobotReturn{

    public static boolean judgeCircle(String moves) {
        int a = 0, b = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U')
                a += 1;
            else if (moves.charAt(i) == 'D')
                a -= 1;
            else if (moves.charAt(i) == 'R')
                b += 1;
            else if (moves.charAt(i) == 'L')
                b -= 1;
        }

        return a == 0 && b == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter moves (U, D, L, R):");
        String moves = sc.nextLine();

        boolean result = judgeCircle(moves);
        System.out.println(result);

        sc.close();
    }
}
