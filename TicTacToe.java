import java.util.Scanner;

/**
 * @author xiaobzhu
 * this is the main class, it used to run the project
 */
public class TicTacToe{
    /**
     * This is the main method in this method it need the user to choose the game mode first, from 1-3 three mode,
     * then it will go in the exactly method to play the game
     * @param args parameter in the main method
     */
    public static void main(String args[]){
        System.out.println("Please choose the game mode");
        System.out.println("1: Player V.S. Player");
        System.out.println("2. Player V.S. Computer");
        System.out.println("3. Computer V.S. Computer");
        Scanner scanner = new Scanner(System.in);// this scanner is used to get the user input that let the user to decide the game mode that they want to play
        int input = scanner.nextInt();
        String[][] board = new String[3][3];  // this for loop is used to set a empty board
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j ++){
                board[i][j] = " ";
            }
        }
        Player[] players = new Player[2];  // This is used to set a array length is 2 to contain the two players
        Board board1 = new Board(); // this is used to call the constructor in the board class
        if(input == 3){
            players[0] = new ComputerPlayer(); // set the first player is computerplayer
            players[1] = new ComputerPlayer(); // set the second player is computerplayer
            while(!board1.checkWin(board)){
                players[0].makeMove(board,0);
                if(!board1.checkWin(board))
                players[1].makeMove(board,1);
            }
        }
        if(input == 2){
            players[0] = new ComputerPlayer();
            players[1] = new HumanPlayer();
            while(!board1.checkWin(board)){
                players[0].makeMove(board,0);
                if(!board1.checkWin(board))
                players[1].makeMove(board,1);
            }
        }
        if(input == 1){
            players[0] = new HumanPlayer();
            players[1] = new HumanPlayer();
            while(!board1.checkWin(board)){
                players[0].makeMove(board,0);
                if(!board1.checkWin(board))
                    players[1].makeMove(board,1);
            }
        }
    }
}