/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;
import java.util.ArrayList;

/**
 *
 * @author Yinyue Hu
 */
public class Main {
    
    ArrayList<Player> players;
    
    public void setupTournament() {
        players=new ArrayList<Player>();
        players.add(new RandomPlayer());
        players.add(new T4TPlayer());
        players.add(new ALLDPlayer());
        players.add(new PavlovPlayer());
        players.add(new T2TPlayer());
        players.add(new ALLCPlayer());
    }

    public void roundRobin() {
        Judge dredd=new Judge();
        for (Player p1: players) {
            for (Player p2: players) {
                if (p1==p2) continue;
                
                p1.setMatchScore(0);
                p2.setMatchScore(0);
                dredd.playMatch(p1, p2, 10);
                //--------------------------
                System.out.println(p1.getID()+"\t"+p2.getID()+"\t"+p1.getScore()+"\t"+p2.getScore());
            }
        }
    }
    
    public void printResults() {
        System.out.println("RESULTS>>>>>>>");
        for (Player p : players) {
            System.out.println(p.toString());
        }
    }
    
     public static void main(String[] args) {
        Main foo=new Main();

        foo.setupTournament();
        foo.roundRobin();
        foo.printResults();


    }







}
