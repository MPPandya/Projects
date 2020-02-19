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
public class EmployeeController {
    
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getName() {
        return model.getEname();
    }

    public String getType() {
        return model.getEtype();
    }
    
    public void setName(String s) {
         model.setEname(s);
    }

    public void setType(String s) {
         model.setEtype(s);
    }
    
    public void viewDetails(){
        view.Display(model.getEname(),model.getEtype());
    }
    
}
