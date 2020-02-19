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
public class Butter extends BreadItemDecorator {
    
    protected BreadItem b1;
    public Butter(BreadItem b)
    {
        super(b);
        this.b1=b;
    }
    
    @Override
    public float cost()
    {
        return b1.cost()+5.0F;
    }
    
}
