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
public class Cheese extends BreadItemDecorator {
    
    protected BreadItem b1;
    
    public Cheese(BreadItem b)
    {
        super(b);
        this.b1=b;
    }
    
    @Override
    public float cost()
    {
        return b1.cost() + 5.0F;
    }
}
