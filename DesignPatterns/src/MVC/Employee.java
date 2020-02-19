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
public class Employee {
   // private String eid;
    private String ename;
    private String etype;

    public Employee(String ename, String etype) {
       
        this.ename = ename;
        this.etype = etype;
    }

    public String getEname() {
        return ename;
    }

    public String getEtype() {
        return etype;
    }

   

   
    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }
    
    
}
