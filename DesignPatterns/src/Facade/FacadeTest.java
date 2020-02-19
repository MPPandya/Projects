/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author madhav pandya
 */
public class FacadeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Restaurant r1=new Restaurant();
        
        GujaratiFood g1 = new GujaratiFood();
        g1.setName("Thepala");
        g1.setType("Gujarati");
        
        PunjabiFood p1 = new PunjabiFood();
        p1.setName("Panner-Toofani & Buuter Tandoori Roti ");
        p1.setType("Punjabi");
        
        r1.PrepareGujarati(g1);
        System.out.println("Gujarati food Preapared.");
        r1.PreparePunjabi(p1);
        System.out.println("Punajabi food Preapared.");
        
        System.out.println(">>>>..ENJOY..<<<");
    }
    
    
}
