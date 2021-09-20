import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {

        int rounds = 3;
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

        if (vsBot == true) {
            playBot(rounds);
        } else if (vsPlayer == true)
            playPlayer(rounds);

    }

    //Going against the bot
    public static void playBot(int rounds) {
        boolean playerWin = false;
        boolean botWin = false;

        for (int i = 0; i < rounds; i++) {


            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Player 1 choose a move between rock, paper or scissor: ");
            String player1Move = scanner1.nextLine();


            System.out.println("We will now use our toaster IQ ai pick a random move: ");
            int rand = (int) Math.random() * 3;
            String botMove = "";
            if (rand == 0) {
                botMove = "rock";
            } else if (rand == 1) {
                botMove = "paper";
            } else {
                botMove = "scissor";

            }

            if (player1Move.equals(botMove)) {
                System.out.println("Its a draw");
            } else if (player1Move.equals("rock") || botMove.equals("scissor")) {
                playerWin = true;
                botWin = false;
            } else if (player1Move.equals("paper") || botMove.equals("rock")) {
                playerWin = true;
                botWin = false;
            } else if (player1Move.equals("scissor") || botMove.equals("paper")) {
                playerWin = true;
                botWin = false;
            } else if (player1Move.equals("rocks") || botMove.equals("paper")) {
                botWin = true;
                playerWin = false;
            } else if (player1Move.equals("paper") || botMove.equals("scissor")) {
                botWin = true;
                playerWin = false;
            } else if (player1Move.equals("scissor") || botMove.equals("rock")) {
                botWin = true;
                playerWin = false;
            }

            if (playerWin == true) {
                System.out.println("Player 1 has won");
            } else if (botWin == true) {
                System.out.println("The bot wins");
            }

        }
    }

    //Going against weak player 2
    public static void playPlayer(int rounds) {
        boolean player1Win = false;
        boolean player2Win = false;
        int endingRound = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 tell me your name");
        String player1Name = scanner.nextLine();
        System.out.println("And since we have a player 2, please tell me your name");
        String player2Name = scanner.nextLine();

        for (int j = 0; j < rounds; j++) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.println(player1Name + " choose a move between rock, paper or scissor: ");
            String player1Move = scanner1.nextLine();

            System.out.println("Now look away gay ass " + player1Name + " and let " + player2Name + " pick now: ");
            String player2Move = scanner1.nextLine();

            if (player1Move.equals(player2Move)) {
                System.out.println("Its a draw");
            } else if (player1Move.equals("rock") || player2Move.equals("scissor")) {
                player1Win = true;
                player2Win = false;
            } else if (player1Move.equals("paper") || player2Move.equals("rock")) {
                player1Win = true;
                player2Win = false;
            } else if (player1Move.equals("scissor") || player2Move.equals("paper")) {
                player1Win = true;
                player2Win = false;
            } else if (player1Move.equals("rocks") || player2Move.equals("paper")) {
                player2Win = true;
                player1Win = false;
            } else if (player1Move.equals("paper") || player2Move.equals("scissor")) {
                player2Win = true;
                player1Win = false;
            } else if (player1Move.equals("scissor") || player2Move.equals("rock")) {
                player2Win = true;
                player1Win = false;
            }
            if (player1Win == true) {
                System.out.println(player1Name + " wins round " + endingRound);
            } else if (player2Win == true) {
            }
            System.out.println(player2Name + " wins round " + endingRound);
        }
        endingRound += 1;
    }
}
