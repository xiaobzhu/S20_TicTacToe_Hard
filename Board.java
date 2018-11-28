/**
 * @author xiaobzhu
 * This class is working on build the board, in this class it work on the print the Board and check the move is valid or not
 * also in this class it works on check which player is win
 */
public class Board{
    /**
     * this is a private boolean value that used to decide the player is win or not, this might be changed in the checkWin method, if
     * one player is win, it will set the value to true, then the checkWin method can pass the check
     */
    private boolean check = false;

    /**
     * this class is work on to print out the board
     * @param TicTacToe this is the value pass in from the computer player or Human player classes
     */
    public void printBoard(String[][] TicTacToe){
        for(int i =0; i < 3; i ++){ //this for loop is used to print out the board
            for(int j =0; j <3; j++){
                if(TicTacToe[i][j] .equals("X")){
                    System.out.print("|X");
                }
                else if (TicTacToe[i][j] .equals("O")){
                    System.out.print("|O");
                }
                else{
                    System.out.print("| ");
                }
                System.out.print("| ");
            }
            System.out.println();
        }
    }

    /**
     * This method is used to check the move is valid, if the position there is null string, so the position is avaliable to draw the keys
     * @param x is the position value of the game
     * @param y is the int position value of the game
     * @param TicTacToe is 2D-array String value pass value from the players classes, each time when player draw the key it need to check the position is avaliable or not
     * @return the return value if it return true, it means this position is avaliable, if it retrun false, it means this position is not avaliable
     */
    public boolean checkValidMoves(int x, int y, String[][] TicTacToe){
        if(TicTacToe[x][y].equals(" ")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * this method is used to check which player is win, I set all the win option at here if each user can reach the any of the option offered below, it will return the the true value and print out the win message
     * else it will return the false value continue to do the next time check until the one player reach the option that offered below
     * @param ticTacToe this is the value pass in from the board part, every time when user draw a key on the board it will do the check that if there is a user win the game and print out the win message
     * @return is a boolean value if the win option is not reached it will return false, until one player reached the win option, it will return turn;
     */
    public boolean checkWin(String[][] ticTacToe){
        /**
         * X    X    X
         * O    O    O
         * O    O    O
         */
        if(ticTacToe[0][0] .equals("X")  && ticTacToe[0][1] .equals("X") &&ticTacToe[0][2] .equals("X") ){
            if(!check){
                System.out.println("Player 1 win");
                check = true;
            }
            return true;
        }
        /**
         * O    O    O
         * X    X    X
         * O    O    O
         */
        else if(ticTacToe[1][0] .equals("X")  && ticTacToe[1][1] .equals("X") &&ticTacToe[1][2] .equals("X") ){
            if(!check){
                System.out.println("Player 1 win");
                check = true;
            }
            return true;
        }
        /**
         * O    O    O
         * O    O    O
         * X    X    X
         */
        else if(ticTacToe[2][0] .equals("X") && ticTacToe[2][1] .equals("X") &&ticTacToe[2][2] .equals("X") ){
            if(!check){
                System.out.println("Player 1 win");
                check = true;
            }
            return true;
        }
        /**
         * X    O    O
         * X    O    O
         * X    O    O
         */
        else if(ticTacToe[0][0] .equals("X") && ticTacToe[1][0] .equals("X") &&ticTacToe[2][0].equals("X") ){
            if(!check){
                System.out.println("Player 1 win");
                check = true;
            }
            return true;
        }
        /**
         * O    X    O
         * O    X    O
         * O    X    O
         */
        else if(ticTacToe[0][1] .equals("X") && ticTacToe[1][1] .equals("X") &&ticTacToe[2][1] .equals("X") ){
            if(!check){
                System.out.println("Player 1 win");
                check = true;
            }
            return true;
        }
        /**
         * O    O    X
         * O    O    X
         * O    O    X
         */
        else if(ticTacToe[0][2].equals("X") && ticTacToe[1][2] .equals("X") &&ticTacToe[2][2].equals("X")){
            if(!check){
                System.out.println("Player 1 win");
                check = true;
            }
            return true;
        }
        /**
         * X    O    O
         * O    X    O
         * O    O    X
         */
        else if(ticTacToe[0][0] .equals("X") && ticTacToe[1][1] .equals("X") &&ticTacToe[2][2] .equals("X") ){
            if(!check){
                System.out.println("Player 1 win");
                check = true;
            }
            return true;
        }
        /**
         * O    O    X
         * O    X    O
         * X    O    O
         */
        else if(ticTacToe[0][2].equals("X") && ticTacToe[1][1].equals("X") &&ticTacToe[2][0].equals("X") ){
            if(!check){
                System.out.println("Player 1 win");
                check = true;
            }
            return true;
        }
        else if(ticTacToe[0][0] .equals("O") && ticTacToe[0][1].equals("O") &&ticTacToe[0][2].equals("O") ){
            if(!check){
                System.out.println("Player 2 win");
                check = true;
            }
            return true;
        }
        else if(ticTacToe[1][0].equals("O") && ticTacToe[1][1].equals("O") &&ticTacToe[1][2].equals("O") ){
            if(!check){
                System.out.println("Player 2 win");
                check = true;
            }
            return true;
        }
        else if(ticTacToe[2][0].equals("O") && ticTacToe[2][1].equals("O") &&ticTacToe[2][2].equals("O") ){
            if(!check){
                System.out.println("Player 2 win");
                check = true;
            }
            return true;
        }
        else if(ticTacToe[0][0].equals("O") && ticTacToe[1][0].equals("O") &&ticTacToe[2][0].equals("O") ){
            if(!check){
                System.out.println("Player 2 win");
                check = true;
            }
            return true;
        }
        else if(ticTacToe[0][1] .equals("O") && ticTacToe[1][1].equals("O") &&ticTacToe[2][1].equals("O") ){
            if(!check){
                System.out.println("Player 2 win");
                check = true;
            }
            return true;
        }
        else if(ticTacToe[0][2].equals("O") && ticTacToe[1][2] .equals("O") &&ticTacToe[2][2].equals("O") ){
            if(!check){
                System.out.println("Player 2 win");
                check = true;
            }
            return true;
        }
        else if(ticTacToe[0][0].equals("O") && ticTacToe[1][1].equals("O") &&ticTacToe[2][2].equals("O") ){
            if(!check){
                System.out.println("Player 2 win");
                check = true;
            }
            return true;
        }
        else if(ticTacToe[0][2].equals("O") && ticTacToe[1][1].equals("O") &&ticTacToe[2][0].equals("O") ){
            if(!check){
                System.out.println("Player 2 win");
                check = true;
            }
            return true;
        }
        else{
            return false;
        }

    }

}