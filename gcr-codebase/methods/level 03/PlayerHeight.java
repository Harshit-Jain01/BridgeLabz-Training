import java.util.Random;

class PlayerHeight{

    //  sum of heights
    public static int findSum(int[] heights){
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    // mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double)sum/heights.length;
    }

    //shortest height
    public static int findShortest(int[] heights) {
        int min=heights[0];
        for (int i=1;i<heights.length;i++) {
            if (heights[i]< min) {
                min=heights[i];
            }
        }
        return min;
    }

    // tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int i=1;i<heights.length;i++) {
            if (heights[i]>max) {
                max=heights[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights=new int[11];
        Random rand=new Random();

        // generate random heights 
        for (int i=0;i< heights.length;i++) {
            heights[i]=rand.nextInt(101)+150;
        }

        // displaying heights
        System.out.println("Heights");
        for (int i=0;i<heights.length;i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double meanHeight = findMean(heights);

        // displaying results
        System.out.println("Shortest Height " + shortest);
        System.out.println("Tallest Height " + tallest);
        System.out.println("Mean Height " + meanHeight);
		
    }
}
