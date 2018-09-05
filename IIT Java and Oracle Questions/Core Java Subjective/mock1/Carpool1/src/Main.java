
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) throws IOException, ParseException {
        
        Long id;
        String firstName,lastName,email,contactNumber,licenseNumber;
        Date licenseStartDate,licenseExpiryDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Member member[]=new Member[2];
        int i;
        for(i=0;i<2;i++) {
            System.out.println("Member"+(i+1)+" :");
            System.out.println("id: ");
            id = Long.parseLong(br.readLine());
            System.out.println("first name: ");
            firstName = br.readLine();
            System.out.println("last name: ");
            lastName = br.readLine();
            System.out.println("email: ");
            email = br.readLine();
            System.out.println("contact number: ");
            contactNumber = br.readLine();
            System.out.println("license number: ");            
            licenseNumber = br.readLine();
            System.out.println("license start date: ");
            licenseStartDate = dateFormat.parse(br.readLine());
            System.out.println("license expiry date: ");
            licenseExpiryDate = dateFormat.parse(br.readLine());
            member[i]=new Member(id, firstName, lastName, email, contactNumber, licenseNumber, licenseStartDate, licenseExpiryDate);
        }
        for(i=0;i<2;i++) {
			System.out.println("\nMember "+(i+1));
			System.out.println(member[i]);
		}
        
        if(member[0].equals(member[1]))
            System.out.println("Member 1 is same as Member 2");
        else
            System.out.println("Member 1 and Member 2 are different");
    }
}
