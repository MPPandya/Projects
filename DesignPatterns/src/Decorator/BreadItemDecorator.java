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
public abstract class BreadItemDecorator implements BreadItem {
    
    protected BreadItem breaditem;

    public BreadItemDecorator(BreadItem breaditem) {
        this.breaditem = breaditem;
    }
    
    @Override
    public float cost()
    {
        return breaditem.cost();
    }
}
