/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author Yinyue Hu
 */
public class T2TPlayer extends BasicPlayer{
    
  
    int oppLastMove=GameMove.COOPERATE;
    int oppSecondLastMove=GameMove.COOPERATE;
    
    public T2TPlayer() {
        myID="T2T Player";
    }

    public int makeMove() {
        if (oppLastMove==GameMove.DEFECT && oppSecondLastMove==GameMove.DEFECT)
                return GameMove.DEFECT;
        else
                return GameMove.COOPERATE;
    }

    @Override
    public void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID) {
        oppSecondLastMove=oppLastMove;
        oppLastMove=oppMove;
        super.setScore(myMove,oppMove,myScore,oppScore,oppID);
    }


}