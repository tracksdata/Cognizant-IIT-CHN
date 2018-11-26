import java.io.BufferedReader;
import java.util.ArrayList;
public class Car {
   private String licenceNumber;
   private String model;
   private Double currentMileage;
   private Integer engineSize;
   


public Car(String licenceNumber, String model, Double currentMileage,
		Integer engineSize) {
	super();
	this.licenceNumber = licenceNumber;
	this.model = model;
	this.currentMileage = currentMileage;
	this.engineSize = engineSize;
}

public Car() {
	// TODO Auto-generated constructor stub
}

public String getLicenceNumber() {
	return licenceNumber;
}

public void setLicenceNumber(String licenceNumber) {
	this.licenceNumber = licenceNumber;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public Double getCurrentMileage() {
	return currentMileage;
}

public void setCurrentMileage(Double currentMileage) {
	this.currentMileage = currentMileage;
}

public Integer getEngineSize() {
	return engineSize;
}

public void setEngineSize(Integer engineSize) {
	this.engineSize = engineSize;
}


    
    @Override
public String toString() {
	return "Licence Number:" + licenceNumber + "\nModel:" + model ;
}

	//Dont change the specification of this method
    public static Car addCar(BufferedReader br) {
       
       String licenceNumber, model;Double currentMileage;Integer engineSize;String otherCarDetails;
       Car c = null;
       try {
           System.out.println("Licence Number: ");
           licenceNumber = br.readLine();
           System.out.println("Model: ");
           model = br.readLine();
           System.out.println("Current Mileage: ");
           currentMileage = Double.parseDouble(br.readLine());
           System.out.println("Engine Size: ");
           engineSize = Integer.parseInt(br.readLine());
           c = new Car(licenceNumber,model,currentMileage,engineSize);
           
       }
       catch(Exception e) {
           System.out.println("Could not create Car");
       }
       return c;
       
   }
    
    
    
    
    
    public static Car findCar(String licNo, ArrayList<Car> carList) {
    	Car c1=null;
    	for (int i = 0; i < carList.size(); i++) {
    		 if(licNo.equals(carList.get(i).licenceNumber))
    		 {
    			 c1=new Car();
    			 c1=carList.get(i);
    		 }
		}
		return c1;
      
     }
    
     public static ArrayList<Car> findCarList(String model, ArrayList<Car> carList) {
    	 Car c1=new Car();
    	 int f=0;
    	 ArrayList<Car> al=new ArrayList<>();
     	for (int i = 0; i < carList.size(); i++) {
     		 if(model.equals(carList.get(i).model))
     		 {
     			 c1=carList.get(i);
     			 al.add(c1);
     			 f=1;
     			
     		 }
 		}
     	if(f==0)
     	{
     		al=null;
     	}
		return al;
     }
}
