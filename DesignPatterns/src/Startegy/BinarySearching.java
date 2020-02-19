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
public class BinarySearching implements Searching {
    
   
    public int search1(int[] num ,int l,int r,int key)
    {
        
        
        while(l<=r){
            int mid=(l+r)/2;
            
        if(num[mid]==key)
        {
            return mid;
        }
        else if(num[mid]<key)
        {
            l=mid+1;
        }
        else
        {
            r=mid-1;
        }
        }
        return -1;
    }
    
    
    @Override
    public int searching(int[] num,int key)
    {
       int l=0;
       int r=num.length-1;
       
       
       int temp=search1(num, l, r, key);
       return temp; 
    }
    
}
