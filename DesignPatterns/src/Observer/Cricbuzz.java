/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import java.util.Observer;
import java.util.Observable;
/**
 *
 * @author madhav pandya
 */
public class Cricbuzz implements Observer{
    
    @Override
    public void update(Observable arg0,Object arg1)
    {
       System.out.println(">>CRICBUZZ<<");
       CricketScore c=(CricketScore)arg1;
       System.out.println(" UPDATED SCORE IN CRICBUZZ : "+c.getScore());
    }
    
}
