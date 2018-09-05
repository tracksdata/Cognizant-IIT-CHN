import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Customer {
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
	
	
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email="
				+ email + ", contactNumber=" + contactNumber + ", address="
				+ address.getCity()+","+address.getState()+","+address.getCountry() +","+address.getZipCode()+ "]";
	}
	public Customer() {
		super();
	}
	
	
	public Customer findCustomerById(List<Customer> customerList, Long id)
	{
		Customer c=null;
		for (int i = 0; i <customerList.size(); i++) {
			
			if(id==customerList.get(i).getId())
			{
				c=new Customer();
				c=customerList.get(i);
			}
		}
		return c;
	}
	
	public List<Customer> findCustomerListByState(List<Customer> customerList, String state)
	{	
		
		
		 List<Customer> lc=new ArrayList<Customer>();
		/* for (int i = 0; i <customerList.size(); i++) {
			if(customerList.get(i).getAddress().getState().equalsIgnoreCase(state))
					{
						System.out.println("hi");
						lc.add(customerList.get(i));
						
					}
		}*/
		 
		 
		 for(Customer c:customerList)
		 {
			 if(c.getAddress().getState().equalsIgnoreCase(state))
			 {
				 lc.add(c);
			 }
		 }
		 System.out.println(lc);
		return lc;
	}
	
	
	
	
}
