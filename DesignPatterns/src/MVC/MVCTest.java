/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author madhav pandya
 */
public class MVCTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Employee e1=new Employee("Suresh","HOD");
        Employee e2=new Employee("Yash","Faculty");
        
        EmployeeView view=new EmployeeView();
        EmployeeController controller=new EmployeeController(e2, view);
        controller.viewDetails();
        controller.setType("HOD");
        controller.viewDetails();
     
    }
    
}
