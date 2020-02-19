/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author madhav pandya
 */
public class ProxyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Restaurant r1 = new ProxyRestaurant();
        Restaurant p2 = new ProxyRestaurant("Navjivan");
        Restaurant p1=new ProxyRestaurant("Aquenos");
        
        p1.addFood("panner-toofani");
        p2.addFood("manchurian");
        
        
        System.out.println(p1.order("panner"));
        System.out.println(p2.order("manchurian"));
    }
}