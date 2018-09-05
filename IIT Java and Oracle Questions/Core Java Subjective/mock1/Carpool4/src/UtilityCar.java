
public class UtilityCar extends Car {
	
	private Boolean rearCoolingVents;

	public Boolean getRearCoolingVents() {
		return rearCoolingVents;
	}

	public void setRearCoolingVents(Boolean rearCoolingVents) {
		this.rearCoolingVents = rearCoolingVents;
	}

	public UtilityCar(Long id, String name, Boolean rearCoolingVents) {
		super(id, name);
		this.rearCoolingVents = rearCoolingVents;
	}

	public UtilityCar() {
		super();
	}

	public float calculateDriveCost(Double dist) {
		
		return (float) (dist*18);
	}
	
}
