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
public class StrategyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[]={10,20,30,40,50,60,70,80,90,100};
        
        SearchSelector s1=new SearchSelector(new BinarySearching());
        
        int element = s1.search(num, 1);
        if(element != -1)
        {
            element+=1;
            System.out.println("you searched number using Binary Searching Startegy and it's position is : "+element);
        }
        else
        {
            System.out.println("your searched number is not present");
        }
        
        SearchSelector s2=new SearchSelector(new LinearSearch());
        
         int element2 = s2.search(num, 80);
        if(element2 != -1)
        {
            element2+=1;
            System.out.println("you searched number using Linear Searching Startegy and it's position is : "+element2);
        }
        else
        {
            System.out.println("your searched number is not present");
        }
        
    }
    
}
