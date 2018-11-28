/**
 * @author xiaobzhu
 * This is the abstract class Player, both computerplayer and humanplayer classes inherited from here.
 */
public abstract class Player{
    /**
     * This method is abstract method, both the computerplayer and humanplayer implements this method by overriding it
     * @param draw value pass in to do the let user draw the keys
     * @param player value pass in that the players
     */
    public abstract void makeMove(String[][] draw, int player);
}