/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startegy;

/**
 *
 * @author madhav pandya
 */
public class LinearSearch implements Searching{
    
   
    @Override
    public int searching(int[] num,int key)
    {
        
        for(int i=0;i<num.length;i++)
        {
            if(key==num[i])
            {
                return i;
            }        
        }
        return -1;
    }
    
}
