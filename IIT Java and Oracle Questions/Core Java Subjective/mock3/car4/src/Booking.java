import java.util.Date;



	public class Booking {
	    
		private Long bookingId;
		private Date dateTimeOfService;
		private String paymentMode;
		private Customer customer;
		private Car car;
		private Double amount;
		private String serviceEngineer;
		
		

		
		public Long getBookingId() {
			return bookingId;
		}



		public void setBookingId(Long bookingId) {
			this.bookingId = bookingId;
		}



		public Date getDateTimeOfService() {
			return dateTimeOfService;
		}



		public void setDateTimeOfService(Date dateTimeOfService) {
			this.dateTimeOfService = dateTimeOfService;
		}



		public String getPaymentMode() {
			return paymentMode;
		}



		public void setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
		}



		public Customer getCustomer() {
			return customer;
		}



		public void setCustomer(Customer customer) {
			this.customer = customer;
		}



		public Car getCar() {
			return car;
		}



		public void setCar(Car car) {
			this.car = car;
		}



		public Double getAmount() {
			return amount;
		}



		public void setAmount(Double amount) {
			this.amount = amount;
		}



		public String getServiceEngineer() {
			return serviceEngineer;
		}



		public void setServiceEngineer(String serviceEngineer) {
			this.serviceEngineer = serviceEngineer;
		}



		public Booking(){}



		public Booking(Long bookingId, Date dateTimeOfService,
				String paymentMode, Customer customer, Car car, Double amount,
				String serviceEngineer) {
			super();
			this.bookingId = bookingId;
			this.dateTimeOfService = dateTimeOfService;
			this.paymentMode = paymentMode;
			this.customer = customer;
			this.car = car;
			this.amount = amount;
			this.serviceEngineer = serviceEngineer;
		}



		

		
		
		
		
		
		
    
}
