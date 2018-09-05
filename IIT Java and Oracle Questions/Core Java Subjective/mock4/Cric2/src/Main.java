import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String couponCode;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the coupon code:");
        couponCode = br.readLine();
        System.out.println("1.Validate coupon code\n2.Check validity of coupon code\nEnter the choice:");
        int n=Integer.parseInt(br.readLine());
        if(n==1)
        {
        	Boolean b=validateCouponCode(couponCode);
        	if(b==true)
        	{
        	System.out.println("Coupon code validated");
		}
		else
		{
			System.out.println("Coupon code is invalid");
		}
        }
        if(n==2)
        {
        	System.out.println("Enter the bought date:");
        	String st=br.readLine();
        	Date boughtDate=sdf.parse(st);
        	Boolean b=checkValidityOfCouponCode(couponCode, boughtDate);
        	if(b==true)
        	{
        	System.out.println("Coupon code is valid");
        	}
        	else
        	{
        		System.out.println("The validity of coupon code is over");
        	}
        	
        }
    }
    
    public static boolean validateCouponCode(String couponCode) {
        
    	boolean b=false;
    	
    	
    		if(couponCode.matches("[A-Za-z]{1}[a-zA-Z0-9]{1}[0-9]{2}[A-Za-z0-9]{5}[A-Za-z]{1}"))
    				
    		{
    			b=true;
    		}
    		else
    		{
    			b=false;
    		}
    		
    	
    	return b;
    	
    	
    }
    
    public static boolean checkValidityOfCouponCode(String couponCode, Date boughtDate) throws Exception {
    	 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        int n=Integer.parseInt(couponCode.substring(2,4));
        boolean b=false;
        Calendar c1=new GregorianCalendar();
        c1.setTime(boughtDate);
        c1.add(Calendar.DATE, n);
        
        String cd="01-01-2018";
        Date d1=sdf.parse(cd);
        Calendar c2=new GregorianCalendar();
        c2.setTime(d1);
        if(c1.getTime().before(c2.getTime()))
        {
        	b=false;
        }
        else
        {
        	b=true;
        }
		return b;
       
        
    }
    
}
