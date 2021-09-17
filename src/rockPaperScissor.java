import java.util.Scanner;
public class rockPaperScissor {
    public static void main(String[] args) {

        boolean vsBot = false;
        boolean vsPlayer = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplayer or Offline? ");
        String mOrO = scanner.nextLine();


        if (mOrO.equals("Multiplayer")) {
            vsPlayer = true;
            System.out.println("You have chosen to play against a Player 2");
        } else if (mOrO.equals("Offline")) {
            vsBot = true;
            System.out.println("You have chosen to play against a bot");
        } else {
            System.out.println("I couldnt make out what you were saying, soo i will assume you want to play offline");
            vsBot = true;
        }
        playGame(vsBot,vsPlayer);
    }
    public static void playGame (boolean vsBot, boolean vsPlayer){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Choose a move between rock, paper or scissor: ");
        String player1Move = scanner1.nextLine();


        if (vsPlayer==true){
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Since we have a player two, please choose between rocks, paper or scissor");
            String player2Move = scanner2.nextLine();
        }
        else if(vsBot ==true){
            System.out.println("We will now use our toaster IQ ai pick a random move: ");
            int rand = (int) Math.random() * 3;
            String botMove = "";
            if(rand == 0){
                botMove = "rock";
            }
            else if(rand == 1){
                botMove = "paper";
            }
            else {
                botMove = "scissor";

            }
            System.out.println("Player 1 have chosen "+player1Move+" as theird move");
            System.out.println("The bot have chosen "+botMove+" as their move");

        }
        //Mangler et compare system for hvem der vinder


    }
}
