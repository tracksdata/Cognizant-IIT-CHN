import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Booking {
    
	private Long bookingId;
	private String dateTimeOfService;
	private String paymentMode;
	private Long customerId;
	private Long carId;
	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	private Double amount;
	private String serviceEngineer;
	
	

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getDateTimeOfService() {
		return dateTimeOfService;
	}

	public void setDateTimeOfService(String dateTimeOfService) {
		this.dateTimeOfService = dateTimeOfService;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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

	
	
	
	
	
	public Booking() {
		super();
	}

	

	public Booking(Long bookingId, String string, String paymentMode,
			Long customerId, Long carId, Double amount, String serviceEngineer) {
		super();
		this.bookingId = bookingId;
		this.dateTimeOfService = string;
		this.paymentMode = paymentMode;
		this.customerId = customerId;
		this.carId = carId;
		this.amount = amount;
		this.serviceEngineer = serviceEngineer;
	}

	public static Map<String,List<Booking>> organizeBookings(List<Booking> bookingList) {
		Map<String,List<Booking>> mp=new HashMap<String, List<Booking>>();
	/*	ArrayList<Booking> bl=new ArrayList<>();*/
		for (int i = 0; i < bookingList.size(); i++) {
			if(mp.containsKey(bookingList.get(i).getServiceEngineer()))
			{
				List<Booking> bl=mp.get(bookingList.get(i).getServiceEngineer());
				bl.add(bookingList.get(i));
				mp.put(bookingList.get(i).getServiceEngineer(),bl);
				
			}
			else
			{
				List<Booking> bl=new ArrayList<>();
				bl.add(bookingList.get(i));
				mp.put(bookingList.get(i).getServiceEngineer(),bl);
			}
			
		}
		for(Map.Entry<String,List<Booking>> me:mp.entrySet())
		{
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		return mp;
		
		
    }

    public static List<String> findBestServiceEngineer(Map<String,List<Booking>> bookingMap) {
		double sum=0;
		Map<String,Double> sd=new HashMap<>();
		for(Map.Entry<String,List<Booking>> me:bookingMap.entrySet())
		{
			for (int i = 0; i < me.getValue().size(); i++) {
				sum=sum+me.getValue().get(i).getAmount();
				
			}
			sd.put(me.getKey(),sum);
		}
		for(Map.Entry<String,Double> me:sd.entrySet())
		{
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
    	List<Entry<String,Double>> li=new ArrayList<>();
    	for(Map.Entry<String,Double> md:sd.entrySet() )
    	{
    		li.add(md);
    	}
    	System.out.println(li);
		Collections.sort(li,new Comparator<Entry<String,Double>>() {

			@Override
			public int compare(Entry<String, Double> o1,
					Entry<String, Double> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		System.out.println(li);
		return null;
		
    	
        //fill the code
    }

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", dateTimeOfService="
				+ dateTimeOfService + ", paymentMode=" + paymentMode
				+ ", customerId=" + customerId + ", carId=" + carId
				+ ", amount=" + amount + ", serviceEngineer=" + serviceEngineer
				+ "]";
	}

    
    
    
}
