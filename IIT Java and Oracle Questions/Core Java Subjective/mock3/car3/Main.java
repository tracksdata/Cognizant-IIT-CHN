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
                if(/*fill code here*/) {
                    System.out.println("License number is valid");
                } else {
                    System.out.println("License number is not valid");
                }
                break;
            case 2:
                if(/*fill code here*/) {
                    System.out.println("Experienced Driver");
                } else {
                    System.out.println("Not Experienced Driver");
                }
                break;
            default:
                System.out.println("Invalid option");
                
        }
        
    }
    public static Boolean validateLicenseNumber(String licenceNumber) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = sdf.parse("28-11-2017");
        //fill code here
    }
    
    public static Boolean isExperiencedDriver(String licenceNumber) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = sdf.parse("28-11-2017");
        //fill code here
    }
}

