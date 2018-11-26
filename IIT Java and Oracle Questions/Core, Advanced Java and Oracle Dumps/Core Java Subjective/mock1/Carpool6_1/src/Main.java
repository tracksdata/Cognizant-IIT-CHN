
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Member> memberList = new ArrayList<Member>();
        ArrayList<Car> carList = new ArrayList<Car>();        
        ArrayList<MemberCar> memberCarList = new ArrayList<MemberCar>();
        initData(memberList, carList);
        System.out.println("Color to search");
        String color = br.readLine();
        System.out.println("Number of member cars:");
        int i,n = Integer.parseInt(br.readLine());
        System.out.println("Enter the member car details:");
        for(i=0;i<n;i++) {
            String s = br.readLine();
            memberCarList.add(MemberCar.createInstance(s, memberList, carList));            
        }
        HashMap<String,ArrayList<MemberCar>> hm = MemberCar.groupByColor(memberCarList);
        System.out.println(color+" car registration numbers:");
        for(MemberCar mc: hm.get(color)) {
            System.out.println(mc.getCarRegistrationNumber());
        }        
    }    
    
    
    public static void initData(ArrayList<Member> memberList, ArrayList<Car> carList) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            memberList.add(new Member(1L,"joe","root","joe.root@a.com","1234567890","AH1",sdf.parse("12-12-2001"),sdf.parse("12-12-2010")));
            memberList.add(new Member(2L,"ben","stokes","ben.stokes@a.com","2345678901","AH2",sdf.parse("12-12-2002"),sdf.parse("12-12-2011")));
            memberList.add(new Member(3L,"virat","kohli","virat.kohli@a.com","3456789012","AH3",sdf.parse("12-12-2003"),sdf.parse("12-12-2012")));
            
            carList.add(new Car(1L,"i10","sports","Hyundai",2007,8));
            carList.add(new Car(1L,"alto","kx1","Maruti",2008,6));
            carList.add(new Car(1L,"polo","topline","Volks",2010,5));
            carList.add(new Car(1L,"kwid","lxi","Renault",2010,5));
            
        }
        catch(Exception e) {
            System.out.println("Could not init Data");
        }
        
    }
    
}
