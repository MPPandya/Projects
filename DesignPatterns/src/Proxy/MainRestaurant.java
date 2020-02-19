/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author madhav pandya
 */
public class MainRestaurant implements Restaurant{
    
    private String resaturantName;
    private static List<String>listFood;
    
    public MainRestaurant(String resaturantName){
        this.resaturantName = resaturantName;
        listFood= new ArrayList();
    }
    
    @Override
    public String order(String name)
    {
        for(String m:MainRestaurant.getListFood())
        {
            if(m.equals(name))
            {
                return "you ordered: "+ name + "  in  " +this.resaturantName+" Restaurant";
            }
        }
        return "your ordered item "+name+" is not available at  " +this.resaturantName;
    }

    @Override
    public void addFood(String food)
    {
        listFood.add(food);
    }
    
    @Override
    public void removeFood(String food)
    {
        listFood.remove(food);
    }

    public static List<String> getListFood() {
        return listFood;
    }
    
    
          
    
    
}
