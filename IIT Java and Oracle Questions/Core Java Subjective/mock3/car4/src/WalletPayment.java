public class WalletPayment extends PaymentMode {

   private String walletNumber;

public WalletPayment() {
	super();
	// TODO Auto-generated constructor stub
}

public WalletPayment(String walletNumber2) {
	this.walletNumber=walletNumber2;
}

@Override
public double makePayment(Booking booking) {
	Double d=booking.getAmount()+(booking.getAmount()*0.02);
	return d;
}

public String getWalletNumber() {
	return walletNumber;
}

public void setWalletNumber(String walletNumber) {
	this.walletNumber = walletNumber;
}


   
    
}
