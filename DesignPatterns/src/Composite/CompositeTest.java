/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author madhav pandya
 */
public class CompositeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Friends friend1=new Friends("Madhav","Junagadh");
        Friends friend2=new Friends("Soham","Bhavnagar");
        Friends friend3=new Friends("Raj","Vadodara");
        Friends friend4=new Friends("Nikhil","Kutch");
        
        friend1.add(friend2);
        friend1.add(friend3);
        friend2.add(friend4);
        friend3.add(friend2);
        friend4.add(friend2);
        
        for (Friends f : friend1.getFriend()) {
            System.out.println(f);
          for(Friends f1:f.getFriend()){
                System.out.println(f1);
            }
            
        }
    }
    
}
