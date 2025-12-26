import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        // coffee names and prices
        String[] coffee = {"Cold Coffee","Cafe Latte","Cappuccino","Chocolate Ice","Americano"};
        int[] price = {120,200,90,160,355};
        int[] order = new int[5];

        while (true) {

            System.out.println("\nEnter coffee type (1-5) or type 'exit' to stop");
            System.out.println("1. Cold Coffee - 120");
            System.out.println("2. Cafe Latte - 200");
            System.out.println("3. Cappuccino - 90");
            System.out.println("4. Chocolate Ice - 160");
            System.out.println("5. Americano - 355");

            String choice = kb.next();

            // exit condition
            if (choice.equalsIgnoreCase("exit")) {
                break;
            }

            int type;

            // safe conversion
            try {
                type = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                continue;
            }

            if (type < 1 || type > 5) {
                System.out.println("Invalid coffee type");
                continue;
            }
            System.out.println("Enter quantity:");
            int qty = kb.nextInt();

            switch (type) {
                case 1:
                    System.out.println("Cold Coffee ordered");
                    break;
                case 2:
                    System.out.println("Cafe Latte ordered");
                    break;
                case 3:
                    System.out.println("Cappuccino ordered");
                    break;
                case 4:
                    System.out.println("Chocolate Ice ordered");
                    break;
                case 5:
                    System.out.println("Americano ordered");
                    break;
            }
            order[type - 1] += qty;
        }

        double total = 0, gst = 0;

        System.out.println("\nBill Generated");
        System.out.println("Name\t\tQty\tAmount\tGST");

        for (int i=0;i<5;i++) {
            if (order[i]>0) {
                double amount=price[i]*order[i];
                double tax=amount*0.05;

                System.out.println(coffee[i] + "\t" + order[i] + "\t" + amount + "\t" + tax);

                total += amount;
                gst += tax;
            }
        }
        System.out.println("Total Amount (including GST): " + (total + gst));

        kb.close();
    }
}
