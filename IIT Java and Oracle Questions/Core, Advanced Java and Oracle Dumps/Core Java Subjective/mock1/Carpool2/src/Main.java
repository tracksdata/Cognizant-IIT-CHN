
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        ArrayList<Member> memberList = new ArrayList<Member>();
        ArrayList<Car> carList = new ArrayList<Car>();        
        ArrayList<MemberCar> memberCarList = new ArrayList<MemberCar>();
        
        initData(memberList,carList);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
		    String menu = "Menu: \n 1) Add a Member \n 2) Add a Car \n 3) Assign Car to Member (Assume valid data is supplied) \n 4) Cars Owned \n 5) Exit";
		    System.out.println(menu);
		    int option = Integer.parseInt(br.readLine());
		    if(option == 1) {
		        Member m = addMember(br);
		        memberList.add(m);
		    }
		    if(option == 2) {
		        Car c = addCar(br);
		        carList.add(c);
		    }
		    if(option == 3) {
		        assignCar(br,memberList,carList);
		    }
		    if(option == 4) {
		        System.out.println("member id");
		        String memid = br.readLine();            
		        carsOwned(memid,memberList);
		    }
            if(option == 5){
                break;
            }
		}
        
    }
    
    //Dont change the specification of this method
    public static void carsOwned(String memberId, ArrayList<Member> memberList) {
    	
    	for (int i = 0; i <memberList.size(); i++) {
    		System.out.println("fro");
			if(memberList.get(i).getId()==Long.parseLong(memberId))
			{
				System.out.println("Number of cars : "+memberList.get(i).getCarList().size());
			
			System.out.println("Registration Numbers");
			for (int j = 0; j <memberList.get(i).getCarList().size(); j++) {
				System.out.println(memberList.get(i).getCarList().get(j).getCarRegistrationNumber());
			}}
			
			
			
			
		}

        
    }
    
    public static void assignCar(BufferedReader br, ArrayList<Member> memberList, ArrayList<Car> carList) {
        Long memberId, carId;
        String id, regNum,color;
        
        try {
            System.out.println("member car id");
            id = br.readLine();
            System.out.println("member id");
            memberId = Long.parseLong(br.readLine());
            System.out.println("car id");
            carId = Long.parseLong(br.readLine());
            System.out.println("car registration");
            regNum = br.readLine();
            System.out.println("color");
            color = br.readLine();
            Car c= Car.findCar(carId, carList);
            Member m = Member.findMember(memberId,memberList);
            MemberCar mc = new MemberCar(carId, c, m, regNum, color);
            if(m.getCarList() == null) {
                m.setCarList( new ArrayList<MemberCar>());
            }
            m.getCarList().add(mc);
            
            
            
            
        }
        catch(Exception e) {
            System.out.println("Could not assign");
        }                
    }
    
    public static Car addCar(BufferedReader br) {
        
        String id, name, model,makeYear,company,comfortLevel;
        Car c = null;
        try {
            System.out.println("id: ");
            id = br.readLine();
            System.out.println("name: ");
            name = br.readLine();
            System.out.println("model: ");
            model = br.readLine();
            System.out.println("makeYear: ");
            makeYear = br.readLine();
            System.out.println("company: ");
            company = br.readLine();
            System.out.println("comfort level: ");
            comfortLevel = br.readLine();
            c = new Car(Long.parseLong(id),name,model,Integer.parseInt(makeYear),company,Integer.parseInt(comfortLevel));
            
        }
        catch(Exception e) {
            System.out.println("Could not create Car");
        }
        return c;
        
    }
    
    public static Member addMember(BufferedReader br) {
        String id,firstName,lastName,email,contactNumber,licenseNumber,licenseStartDate,licenseExpiryDate; 
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Member m = null;
        try {
            System.out.println("id: ");
            id = br.readLine();
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
            licenseStartDate = br.readLine();
            System.out.println("license expiry date: ");
            licenseExpiryDate = br.readLine();      
            m = new Member(Long.parseLong(id),firstName,lastName,email,contactNumber,licenseNumber,
                    sdf.parse(licenseStartDate),sdf.parse(licenseExpiryDate));
        }
        catch(Exception e) {
           System.out.println("Unable to create member"); 
        }
        return m;

                
    }

    public static void initData(ArrayList<Member> memberList, ArrayList<Car> carList) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            memberList.add(new Member(1L,"joe","root","joe.root@a.com","1234567890","AH1",sdf.parse("12-12-2001"),sdf.parse("12-12-2010")));
            memberList.add(new Member(2L,"ben","stokes","ben.stokes@a.com","2345678901","AH2",sdf.parse("12-12-2002"),sdf.parse("12-12-2011")));
            memberList.add(new Member(3L,"virat","kohli","virat.kohli@a.com","3456789012","AH3",sdf.parse("12-12-2003"),sdf.parse("12-12-2012")));
            
            carList.add(new Car(1L,"i10","sports",2007,"Hyundai",8));
            carList.add(new Car(1L,"alto","kx1",2008,"Maruti",6));
            carList.add(new Car(1L,"polo","topline",2010,"Volks",5));
            carList.add(new Car(1L,"kwid","lxi",2010,"Renault",5));
            
        }
        catch(Exception e) {
            System.out.println("Could not init Data");
        }
        
    }
    
}
