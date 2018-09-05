
public class Car {
	private Long id;
	String name, model, company;
	int makeYear, comfortLevel;
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
	public Car(Long id, String name, String model, String company,
			int makeYear, int comfortLevel) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.company = company;
		this.makeYear = makeYear;
		this.comfortLevel = comfortLevel;
	}
	public Car() {
		super();
	}
	


}
