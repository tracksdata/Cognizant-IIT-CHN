public class MemberCar {

	private Long id;
	Car car;
	Member member;
	String carRegistrationNumber;
	String carColor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
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
	

	public MemberCar() {
		super();
	}



	public MemberCar(Long carId, Car c, Member m, String regNum, String color) {
		this.id = carId;
		this.car = c;
		this.member = m;
		this.carRegistrationNumber = regNum;
		this.carColor = color;
	}

}
