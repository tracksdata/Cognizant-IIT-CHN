import java.util.Date;

public class CreditCardPayment extends PaymentMode{
	
   private String creditcardNumber;
   private String holderName;
   private String cardNumber;
   private Date dateOfExpiry;
public String getCreditcardNumber() {
	return creditcardNumber;
}
public void setCrditcardNumber(String creditcardNumber) {
	this.creditcardNumber = creditcardNumber;
}
public String getHolderName() {
	return holderName;
}
public void setHolderName(String holderName) {
	this.holderName = holderName;
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
public Date getDateOfExpiry() {
	return dateOfExpiry;
}
public void setDateOfExpiry(Date dateOfExpiry) {
	this.dateOfExpiry = dateOfExpiry;
}
@Override

public double makePayment(Booking booking) {
	double d=booking.getAmount()-(booking.getAmount()*0.05);
	return d;
}
public CreditCardPayment(String creditcardNumber, String holderName,
		String cardNumber, Date dateOfExpiry) {
	super();
	this.creditcardNumber = creditcardNumber;
	this.holderName = holderName;
	this.cardNumber = cardNumber;
	this.dateOfExpiry = dateOfExpiry;
}


   
    
}
