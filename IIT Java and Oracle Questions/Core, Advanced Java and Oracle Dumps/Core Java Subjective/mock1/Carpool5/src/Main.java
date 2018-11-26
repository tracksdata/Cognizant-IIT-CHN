
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Members:");
        int i,n = Integer.parseInt(br.readLine());
        System.out.println("Enter the member details:");
        ArrayList<Member> memberList = new ArrayList<Member>();
        
        for(i=0;i<n;i++) {
            
            try {
                String s = br.readLine();
                memberList.add(Member.createInstance(s));
            }
            catch(InvalidEmailException e) {
                System.out.println(e);
            } 
            
        }
        Collections.sort(memberList);
        for(Member m: memberList) {
            System.out.println(m.getId()+","+m.getFirstName()+","+m.getLastName()+","+m.getEmail()+","+m.getContactNumber());
        }
        
        
    }
    
    
    

    
}
