
public class Sedan extends Car {

	private
	Boolean absEnabled;
	Integer bootSpace;
	public Boolean getAbsEnabled() {
		return absEnabled;
	}
	public void setAbsEnabled(Boolean absEnabled) {
		this.absEnabled = absEnabled;
	}
	public Integer getBootSpace() {
		return bootSpace;
	}
	public void setBootSpace(Integer bootSpace) {
		this.bootSpace = bootSpace;
	}
	public Sedan(Boolean absEnabled, Integer bootSpace) {
		super();
		this.absEnabled = absEnabled;
		this.bootSpace = bootSpace;
	}
	public Sedan() {
		super();
	}
	public Sedan(Long id, String name, Boolean absEnabled, Integer bootSpace) {
		super(id, name);
		this.absEnabled = absEnabled;
		this.bootSpace = bootSpace;
	}
	
	
	
public float calculateDriveCost(Double dist) {
		
		float cost1=0,cost=0;
		cost1=(float) (dist*15);
		if(bootSpace<600)
		{
			return cost1;
		}
		else
		{
			cost=cost1+(float) (dist*15);
			
			return cost;
		}
		
		
	}
	
	
	
}
