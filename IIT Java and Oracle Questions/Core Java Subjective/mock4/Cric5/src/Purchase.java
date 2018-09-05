import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Purchase implements Comparable<Purchase> {
	
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
	
	public static Purchase obtainPurchaseWithAmount(String str) throws NumberFormatException, ParseException, InvalidWholeSaleException
	{
		Purchase p=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String st[]=str.split(",");
		double tot=0;
		for (int i = 3; i < st.length; i=i+3) {
			tot=tot+Double.parseDouble(st[i+1])*Double.parseDouble(st[i+2]);
		}
		
		if(st.length>=18)
		{
			p=new Purchase(Long.parseLong(st[0]),sdf.parse(st[1]),tot,st[2]);
		}
		else
		{
			throw new InvalidWholeSaleException("Purchase "+st[0]+" is not a whole sale");
		}
		return p;
	}
	@Override
	public int compareTo(Purchase arg0) {
		
		return this.getTotalAmount().compareTo(arg0.getTotalAmount());
	}
	
}
