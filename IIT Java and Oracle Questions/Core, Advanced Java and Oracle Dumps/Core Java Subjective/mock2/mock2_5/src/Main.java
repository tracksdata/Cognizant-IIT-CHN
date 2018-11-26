

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        CustomerAddressBO customerAddressBO = new CustomerAddressBO();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of customer:");
        int n = new Integer(br.readLine());
        List<String> csvList = new ArrayList<>();
        
        for(int i = 0; i<n ;i++)
        {
            System.out.println("Enter the customer "+(i+1)+" detail:");
            String s=br.readLine();
            csvList.add(s);
        }
        List<Customer> lc=customerAddressBO.populateCustomers(csvList);
        for (int i = 0; i < lc.size(); i++) {
			System.out.println(lc.get(i));
		}
        System.out.println("Enter the substring to search from customer list:");
        String sub=br.readLine();
        List<Customer> lc1=customerAddressBO.findCustomerNameFromList(lc, sub);
        displayCustomerDetails(lc1);
        
    }
    
    
    public static void displayCustomerDetails(List<Customer> customers)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.format("%-5s %-15s %-5s %-25s %-20s %s\n", "Id","Name","Gender","Email","Contact no","Created on");
        for (int i = 0; i < customers.size(); i++) {
        	System.out.format("%-5s %-15s %-5s %-25s %-20s %s\n", customers.get(i).getId(),customers.get(i).getName(),customers.get(i).getGender(),customers.get(i).getEmail(),customers.get(i).getContactNumber(),customers.get(i).getCreatedOn());
		}
        
    }
}
