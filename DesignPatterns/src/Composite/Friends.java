package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author madhav pandya
 */
public class Friends {
   
    private String Name;
    private String City;
    private List<Friends>friend;

    public Friends(String Name, String City) {
        this.Name = Name;
        this.City = City;
        friend=new ArrayList();
    }
    
    public void add(Friends f)
    {
        friend.add(f);
    }
    
    public void remove(Friends f)
    {
        friend.remove(f);
    }

    public List<Friends> getFriend() {
        return friend;
    }
    
    @Override
    public String toString()
    {
        return ("Friends :  name :"+Name+" city :"+City);
    }
    
}
