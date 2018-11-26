import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Long customerId;
        String firstName, lastName, gender, email, phoneNumber, address;
        Customer c1[]=new Customer[2];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        for (i = 0; i < 2; i++) {
            System.out.println("Customer" + (i+1) + " :");
            System.out.println("customer id: ");
            customerId = Long.parseLong(br.readLine());
            System.out.println("first name: ");
            firstName = br.readLine();
            System.out.println("last name: ");
            lastName = br.readLine();
            System.out.println("gender: ");
            gender = br.readLine();
            System.out.println("email: ");
            email = br.readLine();
            System.out.println("phone number: ");
            phoneNumber = br.readLine();
            System.out.println("address: ");
            address = br.readLine();
            c1[i]=new Customer(customerId,firstName,lastName,gender,email,phoneNumber,address);
        }
        
        for (i = 0;i < 2; i++) {
        	System.out.println();
        	 System.out.println("Customer " + (i+1));
        	 System.out.println(c1[i]);
        	 
			
		}
        
        if(c1[0].equals(c1[1]))
        {
        	System.out.println("Customer 1 is same as Customer 2 ");
        }
        else
        {
        	System.out.println("Customer 1 and Customer 2 are different");
        }
        
       

    }

}
