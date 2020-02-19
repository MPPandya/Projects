/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author madhav pandya
 */
public class DecoratorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BreadItem burwbs= new Cheese(new Butter(new Burger()));
        System.out.println("Price of Burger with Butter and Cheese : "+burwbs.cost());
    }
    
}
