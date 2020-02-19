/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author madhav pandya
 */
public class ObserverTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CricketScore cricket = new CricketScore("30");
        System.out.println("Initial CricketScore "+cricket.getScore());
        
        cricket.addObserver(new Cricbuzz());
        cricket.addObserver(new Dream11());
        
        cricket.updateScore("35");
        cricket.updateScore("45");
        
    }
    
}
