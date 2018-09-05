import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        List<Customer> customerList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String choice;
        do {
            System.out.println("Enter customer details:");
           
            
            try {
            	 String cs=br.readLine();
            	 String st[]=cs.split(",");
            	
            	 if(st[4].contains("@")&&(st[4].contains(".com")||st[4].contains(".org")))
            	 {
            		 Customer c=new Customer(Long.parseLong(st[0]),st[1],st[2],st[3],st[4],st[5], st[6]);
            		 customerList.add(c);
            		 
            	 }
            	 else
            	 {
            		 throw new InvalidEmailException("Invalid Email for the user");
            	 }
            	 
            } catch (InvalidEmailException ex) {
                System.out.println(ex);
            }
            System.out.println("Do you want to continue?");
            choice = br.readLine();
        } while(choice.equals("yes"));
        Collections.sort(customerList, new CustomerComparator());
        System.out.format("%-5s %-15s %-15s %-15s %-15s %s\n","Id","First Name","Last Name","Gender","Email","Phone");
        for(Customer customer : customerList) {
            System.out.format("%-5s %-15s %-15s %-15s %-15s %s\n",customer.getCustomerId(),customer.getFirstName(),customer.getLastName(),customer.getGender(),customer.getEmail(),customer.getPhoneNumber());
        }
    }
    
}