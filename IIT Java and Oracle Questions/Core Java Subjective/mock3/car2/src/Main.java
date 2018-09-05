import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    
    public static void main(String[] args) throws IOException {
         
        ArrayList<Car> carList = new ArrayList<Car>();        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
          String menu = "Menu: \n1) Add a Car\n" +"2) Find a Car\n" +"3) Find CarList\n" +"4) Exit";
          System.out.println(menu);
          int option=Integer.parseInt(br.readLine());
          
           if(option == 1) {
        	   Car c1=Car.addCar(br);
        	   carList.add(c1);
    	       
		    }
		    if(option == 2) {
		    	
		        System.out.println("Licence Number");
		        String ln=br.readLine();
		        
		        Car c2=Car.findCar(ln, carList);
		        if(c2==null)
		        {
		        	System.out.println("Licence Number not present");
		        }
		        else
		        {
		        	System.out.println(c2);
		        	
		        }
		    }
		    if(option == 3) {
		    	ArrayList<Car> al=new ArrayList<>();
		        System.out.println("Model");
		        String mdl=br.readLine();
		        al=Car.findCarList(mdl, carList);
		        
		        if(al!=null)
		        {
		        	for (int i = 0; i < al.size(); i++) {
						System.out.println(al.get(i));
					}
		        	
		        }
		        else
		        {
		        	System.out.println("Car "+mdl+" not found");
		        }
		       
		    }
		    if(option == 4) {
		       System.exit(0);
		    }
           
        }
    }
}
