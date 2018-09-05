
public class HatchBack extends Car {

	private
	Boolean powerWindowsEnabled;
	Boolean automaticGear;
	public Boolean getPowerWindowsEnabled() {
		return powerWindowsEnabled;
	}
	public void setPowerWindowsEnabled(Boolean powerWindowsEnabled) {
		this.powerWindowsEnabled = powerWindowsEnabled;
	}
	public Boolean getAutomaticGear() {
		return automaticGear;
	}
	public void setAutomaticGear(Boolean automaticGear) {
		this.automaticGear = automaticGear;
	}
	public HatchBack(Long id, String name, Boolean powerWindowsEnabled,
			Boolean automaticGear) {
		super(id, name);
		this.powerWindowsEnabled = powerWindowsEnabled;
		this.automaticGear = automaticGear;
	}
	
	public float calculateDriveCost(Double dist) {
		
		float cost=0;
		if(automaticGear==false)
		{
			cost=(float) (dist*10);
		}
		else
		{
			cost=(float) (dist*12);
		}
		return cost;
		
	}
	
	
	
	
}
