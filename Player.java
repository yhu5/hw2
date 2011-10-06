/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author Yinyue Hu
 */
public interface Player {
    
    String getID();
    int makeMove();
    void setMatchScore(int score);
    void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID);
    String toString();
    int getScore();

}

    

