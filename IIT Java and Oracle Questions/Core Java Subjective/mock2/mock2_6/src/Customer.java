import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class Customer implements Comparable<Customer>{
	
	static SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    private Long id;
    private String name;
    private Character gender;
    private String email;
    private String contactNumber;
    private Date createdOn;
    private Address address;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static List<Customer> getCustomerList() {
		return customerList;
	}

	public static void setCustomerList(List<Customer> customerList) {
		Customer.customerList = customerList;
	}

	
	
	public Customer(Long id, String name, Character gender, String email,
			String contactNumber, Date createdOn, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
		this.createdOn = createdOn;
		this.address = address;
	}

	public Customer(){}

    
    
    public static List<Customer> customerList = new ArrayList<>();
  
    public static Map<String, Integer> convertCsvToMap(List<String> csvDetails) throws NumberFormatException, ParseException
    {
    	List<String> cl=new ArrayList<>();
    	 Map<String, Integer> mp=new HashMap<String, Integer>();
       for (int i = 0; i < csvDetails.size(); i++) {
		
    	   String s[]=csvDetails.get(i).split(",");
    	   cl.add(s[8]);
    	   Customer c=new Customer(Long.parseLong(s[0]),s[1], s[2].charAt(0),s[3], s[5],sdf.parse(s[4]),new Address(s[6],s[7], s[8], s[9], Integer.parseInt(s[10])));
    	   customerList.add(c);
			mp.put(s[8],Collections.frequency(cl, s[8]));
		}
	return mp;
    	   
	}
    
 
    public static List<Customer> getCustomerListFromMap(Map<String, Integer> customerMap)
    {
       
    	Collections.sort(customerList);
		return customerList;
    	
    	
    	
    	
    }

	@Override
	public int compareTo(Customer arg0) {
		// TODO Auto-generated method stub
		if(arg0.getAddress().getState().equals(this.getAddress().getState()))
		{
			return arg0.getName().compareTo(this.getName());
		}
		else
		{
			return arg0.getAddress().getState().compareTo(this.getAddress().getState());
		}
	}
    
}
