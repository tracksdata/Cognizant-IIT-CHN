import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws IOException, ParseException {
        
        String id,name,email,contactNumber,createdOn,gender; 
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        ArrayList<Customer> customerList = new ArrayList<>();
        for(i=0;i<2;i++) {
            System.out.println("Customer"+(i+1)+" :");
            System.out.println("id: ");
            id = br.readLine();
            System.out.println("name: ");
            name = br.readLine();
            System.out.println("Gender: ");
            gender = br.readLine();
            System.out.println("email: ");
            email = br.readLine();
            System.out.println("contact number: ");
            contactNumber = br.readLine();
            System.out.println("createdOn: ");            
            createdOn = br.readLine(); 
            
             //fill code here.
        }
        
        //fill code here.
        if(/*fill code here.*/) {
            System.out.println("Customer 1 is same as Customer 2");
        }
        else {
            System.out.println("Customer 1 and Customer 2 are different");
        }
        
    }
    
}
