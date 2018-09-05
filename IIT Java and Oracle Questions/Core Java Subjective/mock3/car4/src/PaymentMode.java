public abstract class PaymentMode {
    
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public abstract double makePayment(Booking booking);
	
}
