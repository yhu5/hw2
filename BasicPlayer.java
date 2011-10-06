/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author Yinyue Hu
 */
public abstract class BasicPlayer implements Player {

    String myID="";
    int totalScore=0;
    int MatchScore=0;

    public BasicPlayer() {
        myID="Basic Player";
    }

    public void setID(String id) {
        myID=id;
    }
    
    public void setMatchScore (int score) {
        MatchScore=score;
    }

    public String getID() {
        return(myID);
    }

    public void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID) {
       totalScore+=myScore;
       MatchScore+=myScore;
       //System.out.println("Score"+myScore+" over "+oppScore+" My total: "+totalScore);
    }

    public String toString() {
        return(myID+" "+ totalScore);
    }
    
    public int getScore() {
        return (MatchScore);
    }
}
