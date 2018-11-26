public class Car {

	private Long id;
	private String name;

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

	
	public Car() {
		super();
	}

	public Car(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public float calculateDriveCost(Double dist) {
		// TODO Auto-generated method stub
		return 0;
	}

}
