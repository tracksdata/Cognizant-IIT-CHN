
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("id");
        Long id = Long.parseLong(br.readLine());
        System.out.println("name");
        String name = br.readLine();
        System.out.println("type");
        String ct = br.readLine();
        System.out.println("distance");
        Double dist = Double.parseDouble(br.readLine());

        Car carObj = null;
        if(ct.equals("hatchback")) {
            System.out.println("power windows");
            Boolean pw = Boolean.parseBoolean(br.readLine());
            System.out.println("automatic");
            Boolean am = Boolean.parseBoolean(br.readLine());            
            carObj = new HatchBack(id,name,pw,am);
        }
        else if(ct.equals("sedan")) {
            System.out.println("abs enabled");
            Boolean pw = Boolean.parseBoolean(br.readLine());
            System.out.println("boot space");
            Integer am = Integer.parseInt(br.readLine());            
            carObj = new Sedan(id,name,pw,am);
        }
        else {
            System.out.println("rear cooling vents");
            Boolean pw = Boolean.parseBoolean(br.readLine());
            carObj = new UtilityCar(id,name,pw);
            
        }

        System.out.println("Cost is Rs "+Math.round(carObj.calculateDriveCost(dist)));
        
   
    }
    
}
