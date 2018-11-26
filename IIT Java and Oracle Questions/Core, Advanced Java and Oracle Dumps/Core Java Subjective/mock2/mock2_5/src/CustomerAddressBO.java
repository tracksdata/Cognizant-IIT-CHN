import java.text.SimpleDateFormat;
import java.util.*;
public class CustomerAddressBO {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public List<Customer> populateCustomers(List<String> csvList) throws Exception
    {
    	List<Customer> lc=new ArrayList<Customer>();
       for (int i = 0; i <csvList.size(); i++) {
		String str[]=csvList.get(i).split(",");
		Customer c=new Customer(Long.parseLong(str[0]), str[1], str[2].charAt(0),str[3], str[4],sdf.parse(str[5]));
		lc.add(c);
	}
	return lc;
    }
    
    
    
    
    
    public List<Customer> findCustomerNameFromList(List<Customer>customers,String subString) throws Exception
    {
    	
    	List<Customer> lc=new ArrayList<Customer>();
        for (int i = 0; i < customers.size(); i++) {
			if(customers.get(i).getName().contains(subString))
			{
				lc.add(customers.get(i));
			}
		}
		return lc;
    }
    
    
}
