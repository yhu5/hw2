/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author Yinyue Hu
 */
public class ALLCPlayer extends BasicPlayer{
    
    public ALLCPlayer() {
        myID="ALLC Player";
    }
    public int makeMove() {
        return GameMove.COOPERATE;
    }
}
