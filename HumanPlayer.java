import java.util.Scanner;

/**
 * @author xiaobzhu
 * this class is extend from the Player class, in this method it works on let the human player/s to draw the keys
 */
public class HumanPlayer extends Player {
    /**
     * this method is used to implements the method in the player class, in this class, it do the check the position is avalibale or not
     * @param ticTacToe the value pass in that do the check each time and draw the key
     * @param player value pass in that the players
     */
    @Override
    public void makeMove(String[][] ticTacToe, int player) {
        Board board = new Board();
        System.out.println("Enter the x position (1-3)");
        Scanner scanner = new Scanner(System.in); // this scanner is used to let the user input the position that they want to draw the keys
        int x = scanner.nextInt()-1;
        if(x < 0 || x > 3){
            System.out.println("Invalid input");
            throw new IllegalArgumentException("invalid input");
        }
        System.out.println("Enter the y position (1-3)");
        Scanner scannerY =new Scanner(System.in);
        int y = scannerY.nextInt()-1;
        if(y < 0 || y > 3){
            System.out.println("Invalid input");
            throw new IllegalArgumentException("invalid input");
        }

        if(!board.checkValidMoves(x,y,ticTacToe)){ // it will check the position is avaliable or not if the position is nor not
            System.out.println("Invalid input");
            throw new IllegalArgumentException("invalid input");
        }

        if(player == 0){   // to set the user 1 is X
            ticTacToe[x][y] = "X";
        }
        else if(player == 1){  //to set the user 2 is O
            ticTacToe[x][y] = "O";
        }
        board.printBoard(ticTacToe);  // print the board
    }

}
