import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb = "Menu\n1. Parse Name\n2. Valid Email\n3. Play Contact Number\n4. User Lifetime\n5. Exit";
        while(true)
        {
            System.out.println(sb);
            
            int inp = Integer.parseInt(br.readLine());
            switch(inp) {
                case 1: 
                    parseName(br);
                    break;
                
                case 2: 
                	isValidEmail(br);
                    break;
                
                case 3: 
                    playContactNumber(br);
                    break;
                
                case 4: 
                    userLifeTime(br);
                    break;
                    
                case 5:
                    System.exit(0);
            }
        }
    }
    
    public static void parseName(BufferedReader br) throws Exception
    {
        System.out.println("Enter name:");
        String name = br.readLine();
        System.out.println(name.replaceAll("[^A-Za-z0-9 ]"," "));
	//fill code here.
    }
    public static void isValidEmail(BufferedReader br) throws Exception
    {
        System.out.println("Enter E-mail id:");
        String email = br.readLine();
        if(email.contains("@")&&(email.contains(".com")||email.contains(".org")||email.contains(".net"))&&!email.contains("@.com"))
            System.out.println("Email id is valid");
        else
            System.out.println("Email is invalid");
    }
    public static void playContactNumber(BufferedReader br) throws Exception
    {
        int sum=0,sum1=0;
        System.out.println("Enter contact number:");
        String number = br.readLine();
        if(number.matches("[0-9]{3}[-][0-9]{4}[-][0-9]{10}"))
        {
        String num1[]=number.split("-");
        String num[]=num1[2].split("");
        for (int i = 0; i < num.length; i++) {
			sum=sum+Integer.parseInt(num[i]);
		}
        if(sum>10)
        {
        	while(sum>0)
        	{
        	int rem=sum%10;
        	sum1=sum1+rem;
        	sum=sum/10;
        	}
        	System.out.println(sum1);
        }
        
        else
        {
        	System.out.println(sum);
        }
        }
        else
        {
        	System.out.println("Contact number invalid");
        }
        
        
    }
    public  static void userLifeTime(BufferedReader br) throws Exception
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        Date startDate = sdf.parse("28-07-2017 09:00");
        
        System.out.println("Enter Created on date(dd-MM-yyyy HH:mm):");
        String inp=br.readLine();
        LocalDateTime ld1=LocalDateTime.parse(inp,DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        LocalDateTime ld2=LocalDateTime.parse("28-07-2017 09:00",DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        System.out.println(ChronoUnit.MINUTES.between(ld1, ld2));
    }
    
}
