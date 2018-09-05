import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Purchase {

	private Long id;
	private Date purchaseDate;
	private Double totalAmount;
	private String user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	
	
	
	public Purchase(Long id, Date purchaseDate, Double totalAmount, String user) {
		super();
		this.id = id;
		this.purchaseDate = purchaseDate;
		this.totalAmount = totalAmount;
		this.user = user;
	}

	public Purchase() {
		super();
	}

	public static void obtainPurchaseWithItem(Map<String, Integer> map,
			String purchaseDetail) {
		int tot=0;
		
		String str[]=purchaseDetail.split(",");
		
		for(int i=3;i<str.length;i=i+3)
		{
			String a=str[i];
			int b=Integer.parseInt(str[i+2]);
			if(map.containsKey(str[i]))
			{
				int c=map.get(a);
				c=c+b;
				map.put(str[i],c);
			}
			else
			{
			
			map.put(str[i],Integer.parseInt(str[i+2]));
			}
		}
		
		
		
		
	}
		
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

