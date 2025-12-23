import java.util.Scanner;

public class RockPaperScissors{

    // generate computer choice
    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);
        if(choice == 0)
            return "Rock";
        else if(choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // find winner
    public static String findWinner(String user, String computer) {

        if(user.equals(computer))
            return "Draw";

        if(user.equals("Rock") && computer.equals("Scissors"))
            return "User";
        if(user.equals("Rock") && computer.equals("Paper"))
            return "Computer";

        if(user.equals("Paper") && computer.equals("Rock"))
            return "User";
        if(user.equals("Paper") && computer.equals("Scissors"))
            return "Computer";

        if(user.equals("Scissors") && computer.equals("Paper"))
            return "User";
        if(user.equals("Scissors") && computer.equals("Rock"))
            return "Computer";

        return "Invalid";
    }

    //calculate wins and percentages
    public static String[][] stats(int Wins, int computerWins, int games) {

        String[][] s= new String[2][3];

        double userPercent = (Wins * 100.0) / games;
        double compPercent = (computerWins * 100.0) / games;

        s[0][0] = "User";
        s[0][1] = String.valueOf(Wins);
        s[0][2] = String.format("%.2f", userPercent);

        s[1][0] = "Computer";
        s[1][1] = String.valueOf(computerWins);
        s[1][2] = String.format("%.2f", compPercent);

        return s;
    }

    // Method to display results
    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("--------------------------------------");

        for(int i = 0; i < games.length; i++){
            System.out.println(
                (i+1) + "\t" + games[i][0] + "\t" +games[i][1] + "\t\t" +
                games[i][2]
            );
        }

        System.out.println("\nOverall Statistics:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("---------------------------");

        for(int i = 0; i < stats.length; i++){
            System.out.println(
  stats[i][0] + "\t" +stats[i][1] + "\t" +stats[i][2] );
            
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int gamesCount = input.nextInt();

        String[][] gameResults = new String[gamesCount][3];

        int userWins = 0;
        int computerWins = 0;

        for(int i = 0; i < gamesCount; i++){

            System.out.println("\nGame " + (i+1));
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = input.next();

            String c= computerChoice();
            String winner = findWinner(userChoice, c);

            if(winner.equals("User"))
                userWins++;
            else if(winner.equals("Computer"))
                computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = c;
            gameResults[i][2] = winner;
        }

        String[][] arr = stats(userWins, computerWins, gamesCount);
        displayResults(gameResults, arr);

        input.close();
    }
}
