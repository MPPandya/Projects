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
public class GujaratiFoodPreparer implements FoodPrepare {
    
    @Override
    public void prepare(Food food)
    {
      GujaratiFood gfood = (GujaratiFood)food;
      System.out.println("preparing your Gujarati food : " +gfood.getName());
    }
    
}
