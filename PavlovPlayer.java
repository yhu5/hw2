/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author Yinyue Hu
 */
public class PavlovPlayer extends BasicPlayer{
    int oppLastMove=GameMove.COOPERATE;
    int myLastMove=GameMove.COOPERATE;
    public PavlovPlayer() {
        myID="Pavlov Player";
    }
    public int makeMove() {
        if (oppLastMove==myLastMove)
            return GameMove.COOPERATE;
        else
            return GameMove.DEFECT;
    }
    @Override
    public void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID) {
        oppLastMove=oppMove;
        myLastMove=myMove;
        super.setScore(myMove, oppMove, myScore, oppScore, oppID);
    }
}
