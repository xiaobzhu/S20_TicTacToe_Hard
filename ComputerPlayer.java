/**
 * @author xiaobzhu
 * This is the ComputerPlayer class, in this class, it works on let players draw the keys. after let user draw the keys it will print the Board in current time
 * this class is inherited from the abstract class, in this class it also implements the method makeMove by overriding
 */
public class ComputerPlayer extends Player {
    /**
     * this method is implements the method in the player class by overriding
     * @param ticTacToe this is the value pass in that used to place the keys
     * @param player value pass in that the players in trun to draw the keys
     */
    @Override
    public void makeMove(String[][] ticTacToe, int player) {
        Board board = new Board();
        for(int i =0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                if (ticTacToe[i][j] .equals(" ")) {
                    if(player == 0 ) {
                        ticTacToe[i][j] = "X";
                        i = i + 3;
                        j = j + 3;
                    }
                    if(player == 1) {
                        ticTacToe[i][j]= "O";
                        i =i+3;
                        j= j+3;
                    }
                }

            }
        }
        board.printBoard(ticTacToe);// print the board
    }


}
