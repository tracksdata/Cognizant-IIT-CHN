import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MemberCar {

	

	private Long id;
	
	Member member;
	Car car;
	String carRegistrationNumber;
	String carColor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}
	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public MemberCar(Long id, Member member, Car car,
			String carRegistrationNumber, String carColor) {
		super();
		this.id = id;
		this.member = member;
		this.car = car;
		this.carRegistrationNumber = carRegistrationNumber;
		this.carColor = carColor;
	}
	public MemberCar() {
		super();
	}
	public static MemberCar createInstance(String s,
			ArrayList<Member> memberList, ArrayList<Car> carList) {
		Member m=new  Member();
		Car c=new Car();
		MemberCar mc=new MemberCar();
		String str[]=s.split(",");
		m.setId(Long.parseLong(str[1]));
		c.setId(Long.parseLong(str[2]));
		
		mc=new MemberCar(Long.parseLong(str[0]), m, c, str[3], str[4]);
		
		return mc;
	}
	public static HashMap<String, ArrayList<MemberCar>> groupByColor(
			ArrayList<MemberCar> memberCarList) {
		
		HashMap<String, ArrayList<MemberCar>> hm=new  HashMap<>();
		for(MemberCar m:memberCarList)
		{
			if(hm.containsKey(m.getCarColor()))
			{
				ArrayList<MemberCar>li=hm.get(m.getCarColor());
				li.add(m);
				hm.put(m.getCarColor(), li);
			}
			else
			{
				ArrayList<MemberCar>li=new ArrayList<>();
				li.add(m);
				hm.put(m.getCarColor(), li);
			}
		}
		return hm;
	}
	
	
	
	
	
}
