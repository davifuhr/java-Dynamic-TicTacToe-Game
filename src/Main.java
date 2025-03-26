import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player[] players = new Player[2];
        char[] symbols = {'X', 'O'};
        Game game;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Player's " + (i + 1) + " name: ");
            players[i] = new Player(scanner.nextLine(), symbols[i]);
        }

        System.out.println("Board's size: ");
        game = new Game(scanner.nextInt());

        for (int i = 0; i < 2; i++) {
            System.out.println(players[i].toString());
        }

        boolean endSession = false;
        Player currentPlayer = players[0];

        while (!endSession) {
            boolean endGame = false;
            while (!endGame) {
                System.out.println(game.toString());
                System.out.println("Player " + currentPlayer.name + " make your move");

                while (true)
                {
                    int lin=0, col=0;
                    System.out.print("line: ");
                    lin = scanner.nextInt();
                    System.out.print("column: ");
                    col = scanner.nextInt();

                    if(lin> game.boardSize)
                    {
                        lin = game.boardSize;
                    }
                    else if (col> game.boardSize)
                    {
                        col = game.boardSize;
                    }

                    if (game.play(lin, col, currentPlayer.getSymbol()))
                    {
                        break;
                    } else {
                        System.out.println("Invalid play. Try again.");
                    }
                }
                if (game.verifyWinner())
                {
                    game.toString();
                    System.out.println("Player " + currentPlayer.name + " won!");
                    currentPlayer.points += 1;
                    endGame = true;
                } else if (game.verifyDraw()) {
                    game.toString();
                    System.out.println("It's a draw!");
                    endGame = true;
                } else {
                    currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
                }
            }
            System.out.println("Do you want to play again? (Y/N)");
            if(scanner.next().equals("Y")){
                game.resetBoard();
                endSession = false;
            }
            else
            {
                endSession = true;
            }
        }

        scanner.close();
        Report report = new Report();
        report.saveReport(players);
        System.out.println("Game report created successfully!");
    }
}