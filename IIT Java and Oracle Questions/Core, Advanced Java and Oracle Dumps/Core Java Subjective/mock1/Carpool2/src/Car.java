import java.util.ArrayList;

public class Car {

	private Long id;
	String name, model, company;
	int makeYear, comfortLevel;

	public Car(Long id, String name, String model,int makeYear, String company,
			 int comfortLevel) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.company = company;
		this.makeYear = makeYear;
		this.comfortLevel = comfortLevel;
	}

	


	public Car() {
		// TODO Auto-generated constructor stub
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public int getComfortLevel() {
		return comfortLevel;
	}

	public void setComfortLevel(int comfortLevel) {
		this.comfortLevel = comfortLevel;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model
				+ ", company=" + company + ", makeYear=" + makeYear
				+ ", comfortLevel=" + comfortLevel + "]";
	}




	public static Car findCar(Long carId, ArrayList<Car> carList) {
		Car c=null;
		for (int i = 0; i < carList.size(); i++) {
			if(carId==carList.get(i).getId())
			{
				c=new Car();
				c=carList.get(i);
			}
		}
		return c;
	}

}
