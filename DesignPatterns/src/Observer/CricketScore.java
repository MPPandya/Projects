/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.Observable;
/**
 *
 * @author madhav pandya
 */
public class CricketScore extends Observable {
    private String score;

    public CricketScore(String score) {
        this.score = score;
    }
    
    public void updateScore(String s)
    {
        this.score=s;
        setChanged();
        notifyObservers(this);
        
    }

    public String getScore() {
        return score;
    }
    
    
    
}
