/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;
import java.util.Scanner;
/**
 *
 * @author Yinyue Hu
 */
public class HumanPlayer extends BasicPlayer{
    
    Scanner a;
    char move;
    public HumanPlayer() {
        myID="Human Player";
    }
    public int makeMove() {
        do{
            System.out.println("Please decide to cooperate(C) or defect(D):");
            a=new Scanner(System.in);
            move=a.next().charAt(0);
            if(move=='C'||move=='c')
            {
                return GameMove.COOPERATE;
            }
            else if(move=='D'||move=='d')
            {
                return GameMove.DEFECT;
            }
            else
            {
                System.out.println("Wrong answer, try again please.");
            }
        }while(true);
        
                
            
            
        
    }
}
