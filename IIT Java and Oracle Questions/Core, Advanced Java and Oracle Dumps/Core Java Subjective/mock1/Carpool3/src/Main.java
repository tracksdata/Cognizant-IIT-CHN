
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    
    public static void main(String[] args) throws IOException, ParseException {
        String menu = "Menu: \n 1) Valid Car registration Number \n 2) Convert Car registration Number \n "
                + "3) Valid Driving License";
        
        //TN-07-AS-1273
        System.out.println(menu);
        System.out.println("Enter choice");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String regnum = "",input="";
        switch(x) {
            case 1: {
                System.out.println("car registration number");
                regnum = br.readLine();
                validateRegNum(regnum);
                break;
            }
            case 2: {
                System.out.println("car registration number");
                regnum = br.readLine();
                convertRegNum(regnum);
                break;
            }
            case 3: {
                System.out.println("driving license issue date");
                input = br.readLine();
                validateDrivingLicense(input);
                break;
            }
            
        }
        
        
        
    }
    
    public static void validateRegNum(String reg) {
    	
    	if(reg.matches("[A-Z]{2}[-][0-9]{2}[-][A-Z]{2}[-][0-9]{4}"))
    	{
    		System.out.println(reg+" is valid");
    	}
    	else
    		
    	{
    		System.out.println(reg+" is Invalid");
    	}
    	
    }

    public static void convertRegNum(String reg) {
    	
    	System.out.println(reg.replaceAll("[^A-Za-z0-9 ]", "-"));
    	
    	
    	
    }
    
    public static void validateDrivingLicense(String inp) throws ParseException {
    	
    	
    	String s1="15-06-2017";
    	
    	LocalDate ld1=LocalDate.parse(s1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    	
    	LocalDate ld2=LocalDate.parse(inp, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    	Period p=Period.between(ld2, ld1);
    	if(p.getYears()>10)
    	{
    		System.out.println(p.getYears()+" years old license - expired");
    	}
    	else
    	{
    		System.out.println(p.getYears()+" years old license - expired");
    	}
 
    	
    	
    }
    
}
