package com.day10.geomeasure;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineComparisonApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Line[]> comparisons = new ArrayList<>();

        System.out.print("Enter number of line comparisons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nComparison " + i);

            System.out.print("Enter x1 y1 x2 y2 for Line 1: ");
            Line line1 = new Line(
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble()
            );

            System.out.print("Enter x1 y1 x2 y2 for Line 2: ");
            Line line2 = new Line(
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble(),
                    sc.nextDouble()
            );

            comparisons.add(new Line[]{line1, line2});
        }

        for (Line[] pair : comparisons) {
            LineComparison.compare(pair[0], pair[1]);
            System.out.println("---");
        }

        sc.close();
    }
}
