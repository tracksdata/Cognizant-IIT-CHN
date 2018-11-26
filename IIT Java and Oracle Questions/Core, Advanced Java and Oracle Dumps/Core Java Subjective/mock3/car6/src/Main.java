import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) throws Exception {
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        ArrayList<Booking> ab=new ArrayList<>();
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String ch="yes";
        do {
            System.out.println("Enter a booking detail:");
            String s=br.readLine();
            String st[]=s.split(",");
            Booking b=new Booking(Long.parseLong(st[0]), st[1], st[2],Long.parseLong(st[3]),Long.parseLong(st[4]),Double.parseDouble(st[5]),st[6]);
            ab.add(b);
            System.out.println("Do you want to add another booking detail:");
            ch=br.readLine();
           
        }while (ch.equalsIgnoreCase("yes"));
        
        Map<String,List<Booking>> mp=Booking.organizeBookings(ab);
        List<String> ls=Booking.findBestServiceEngineer(mp);
        System.out.format("%-15s %s\n","Name","No of Booking");
        //fill the code
    }
    
}
/*Booking b=new Booking(Long.parseLong(st[0]), sdf.format(st[1]), st[2],Long.parseLong(st[3]),Long.parseLong(st[4]),Double.parseDouble(st[5]),st[6]);*/