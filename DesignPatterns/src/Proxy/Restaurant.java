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
public interface Restaurant {
    public String order(String nameFood);
    public void addFood(String name);
    public void removeFood(String name);
}
