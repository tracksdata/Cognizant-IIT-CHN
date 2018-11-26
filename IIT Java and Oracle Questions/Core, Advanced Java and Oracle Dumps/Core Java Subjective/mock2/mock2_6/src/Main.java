import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of customer:");
        int n = new Integer(br.readLine());
        
        List<String> csvList = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the customer "+(i+1)+" details:");
            String s=br.readLine();
            csvList.add(s);
           
        }

        Map<String, Integer> mp=Customer.convertCsvToMap(csvList);

        System.out.println("State - No of customers");
        for(Map.Entry<String,Integer> m:mp.entrySet())
        {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
       
        List<Customer> lc=Customer.getCustomerList();
        System.out.format("%-15s %-20s %-15s %-15s %s\n", "Id","Name","Email","State","Country");
        for (int i = 0; i <lc.size(); i++) {
			System.out.println(lc.get(i));
		}
        

    }
    
}
