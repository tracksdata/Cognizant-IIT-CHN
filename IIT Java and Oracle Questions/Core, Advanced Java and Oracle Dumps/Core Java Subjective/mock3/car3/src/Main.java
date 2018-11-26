import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter license number:");
        String licenseNumber = br.readLine();
        
        System.out.println("Menu:\n" +
                "1) Validate licence Number\n" +
                "2) Check Driver Experience");
        System.out.println("Enter choice: ");
        Integer choice = Integer.parseInt(br.readLine());
        
        switch(choice) {
            case 1:
            {
                if(Main.validateLicenseNumber(licenseNumber)) {
                    System.out.println("License number is valid");
                } else {
                    System.out.println("License number is not valid");
                }
                break;
            }
            case 2:
            {
                if(Main.isExperiencedDriver(licenseNumber)) {
                    System.out.println("Experienced Driver");
                } else {
                    System.out.println("Not Experienced Driver");
                }
                break;
            }
            default:
            {
                System.out.println("Invalid option");
            }
                
        }
        
    }
    public static Boolean validateLicenseNumber(String licenceNumber) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date currentDate = sdf.parse("28-11-2017");
        Boolean f=null;
        if(licenceNumber.matches("[A-Z]{2}[0-9]{2}[0-9]{4}[1-9]{7}"))
        {
        	int x=Integer.parseInt(licenceNumber.substring(4,8));
        	if(x>=2005&&x<=2016)
        	{
        		f=true;
        	}
        	else
        	{
        		f=false;
        	}
        	
        }
        //fill code here
		return f;
		
    }
    
    public static Boolean isExperiencedDriver(String licenceNumber) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = sdf.parse("28-11-2017");
        int x=Integer.parseInt(licenceNumber.substring(4,8));
        int diff=2017-x;
        if(diff>=5)
        {
        	return true;
        }
        else
        {
        	return false;
        }
        
    }
}

