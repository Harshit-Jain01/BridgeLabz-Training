import java.util.Scanner;

public class DeckOfCards{

    // initialize the deck
    public static String[] initializeDeck(String[] suits,String[] ranks){

        int num=suits.length*ranks.length;
        String[] deck=new String[num];

        int index=0;
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<ranks.length;j++){
                deck[index++]=ranks[j]+" of "+suits[i];
            }
        }
        return deck;
    }

    //shuffle the deck
    public static String[] shuffleDeck(String[] deck){
        int n=deck.length;

        for(int i=0;i<n;i++){
            int random=i+(int)(Math.random()*(n-i));

            String temp=deck[i];
            deck[i]=deck[random];
            deck[random]=temp;
        }
        return deck;
    }

    //distribute n cards 
    public static String[][] distributeCards(String[] deck,int players,int cp){

        int total=players*cp;

        if(total>deck.length){
            System.out.println("Cards cannot be distributed!");
            return null;
        }

        String[][] result=new String[players][cp];

        int index=0;
        for(int i=0;i<players;i++){
            for(int j=0;j<cp;j++){
                result[i][j]=deck[index++];
            }
        }
        return result;
    }

    // print players and their cards
    public static void printPlayers(String[][] arr){

        for(int i=0;i<arr.length;i++){
            System.out.println("\nPlayer "+(i+1)+":");
            for(int j=0;j<arr[i].length;j++){
                System.out.println("  "+arr[i][j]);
            }
        }
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10",
                        "Jack","Queen","King","Ace"};

        // initialize deck
        String[] deck=initializeDeck(suits,ranks);

        // shuffle deck
        deck=shuffleDeck(deck);

        // user input
        System.out.print("Enter number of players: ");
        int players=input.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cp=input.nextInt();

        // distribute cards
        String[][] playersCards=distributeCards(deck,players,cp);

        if(playersCards!=null){
            printPlayers(playersCards);
        }

        input.close();
    }
}
