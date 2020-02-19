/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author madhav pandya
 */
public class Restaurant {
    private GujaratiFoodPreparer guj;
    private PunjabiFoodPreparer pun;

    public Restaurant() {
        guj=new GujaratiFoodPreparer();
        pun=new PunjabiFoodPreparer();
    }

   
    public void PrepareGujarati(GujaratiFood gfood)
    {
        guj.prepare(gfood);
    }
    
    public void PreparePunjabi(PunjabiFood pfood)
    {
        pun.prepare(pfood);
    }
}
