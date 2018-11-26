import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

    static List<Customer> customerList;
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    static
    {
        customerList = new ArrayList<>();
        try
        {
        customerList.add(new Customer( 1l, "John Smith",'M', "johnsmith@a.com", "+98-7488-8554744596",sdf.parse("15/02/2017 16:30:00"),
                new Address("15th St","Buffalo", "New York", "USA", 14220)));
        customerList.add(new Customer( 2l, "Aekerman",'M', "aekerman@a.com","+78-7485-9555874846",sdf.parse("18/03/2017 15:45:00"),
                new Address("Avenue","Plano", "Texas", "USA", 75025)));
        customerList.add(new Customer( 3l, "Madeleine",'F', "madeleine@a.com", "+78-9855-7488742136",sdf.parse("22/02/2017 16:45:00"),
                new Address("Parc St","Lubbock", "Texas", "USA", 79404)));
        customerList.add(new Customer(4l, "Edrick",'M', "edrick@a.com", "+99-8787-7844859978",sdf.parse("15/03/2017 15:45:00"),
                new Address("145th St","Wasilla", "Alaska", "USA", 99629)));
        customerList.add(new Customer(5l, "Tedmond", 'M', "tedmond@a.com", "+88-7844-8854799658",sdf.parse("15/03/2017 15:45:00"),
                new Address("Port Townsend","Tacoma", "Washington", "USA", 98412)));
        customerList.add(new Customer(6l, "Nelson",'M', "nelson@a.com", "+88-7848-8857488956",sdf.parse("17/05/2017 10:35:00"),
                new Address("1st St","Akron", "Ohio", "USA", 44304)));
        customerList.add(new Customer(7l, "Dalton", 'M', "dalton@a.com", "+88-8879-8854741124",sdf.parse("01/05/2017 17:25:00"),
                new Address("Lake city", "Newburgh", "New York", "USA", 12550)));
        customerList.add(new Customer(8l, "Raymond", 'M', "raymond@a.com", "+89-7748-8859112478",sdf.parse("17/06/2017 08:45:00"),
                new Address("Wall Street","Texas City", "Texas", "USA", 77591)));
        customerList.add(new Customer(9l, "Rosemary", 'F', "rosemary@a.com", "+89-7844-8857489958", sdf.parse("22/04/2017 16:15:00"),
                new Address("Georgetown","Olympia", "Washington", "USA", 98506)));
        customerList.add(new Customer(10l, "Ruford", 'M', "ruford@a.com", "+88-7485-8597448596", sdf.parse("12/02/2017 09:05:00"),
                new Address("Baker street", "Miles City", "Montana", "USA", 59301)));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws Exception {
    	 Customer c=new Customer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Menu\n1. Find customer by id\n2. Find customer by states\nEnter the choice:");
        switch(new Integer(br.readLine()))
        {
            case 1:
                System.out.println("Enter the Id to find customer:");
                long id=Long.parseLong(br.readLine());
               
                Customer c1=c.findCustomerById(customerList, id);
                if(c1!=null)
                {
                    System.out.println(c1);
                }
                else
                    System.out.println("No Customer with that id");
                break;
            case 2:
                System.out.println("Enter the state:");
                String state=br.readLine();
                List<Customer> lc=new ArrayList<Customer>();
                lc=c.findCustomerListByState(customerList, state);
                if(lc.size()>0)
                {
                    System.out.format("%-15s %-20s %-20s %-15s %-15s %-15s %s\n","Name","Email", "Contact no","Street","City","Country","Zipcode");
                    for (int i = 0; i <lc.size(); i++) {
                    	System.out.format("%-15s %-20s %-20s %-15s %-15s %-15s %s\n",lc.get(i).getName(),lc.get(i).getEmail(), lc.get(i).getContactNumber(),lc.get(i).getAddress().getStreet(),lc.get(i).getAddress().getCity(),lc.get(i).getAddress().getCountry(),lc.get(i).getAddress().getZipCode());
					}
                }
                else
                    System.out.println("No customer belongs that state");
                break;
        }
        
    }
    
}
