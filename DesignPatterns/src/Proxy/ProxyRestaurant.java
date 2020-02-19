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
public class ProxyRestaurant implements Restaurant{
    
    public MainRestaurant main;
   // private static List<String>templist;   // private static List<String>templist;

        

    public ProxyRestaurant() {
    }
    
    public ProxyRestaurant(String name) {
        main=new MainRestaurant(name);
    }
    
    @Override
    public void addFood(String food)
    {
        main.addFood(food);
    }
    
    @Override
    public void removeFood(String food)
    {
        main.removeFood(food);
    }

    
    @Override
    public String order(String name)
    {
        return main.order(name);
    }
    
}
