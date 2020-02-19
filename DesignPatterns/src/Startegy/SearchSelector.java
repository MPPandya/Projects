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
public class SearchSelector {
    private Searching ser;

    public SearchSelector(Searching ser) {
        this.ser = ser;
    }
    
    public int search(int[] num,int key)
    {
        int temp=ser.searching(num, key);
        return temp;
    }
}
