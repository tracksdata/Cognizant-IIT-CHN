import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Long bookingId;
        String dateTimeOfService;
        String paymentMode;
        String creditcardNumber;
        String holderName;
        String walletNumber;
        String cardNumber;
        String serviceEngineer;
        String dateOfExpiry;
        Double amount;
        Customer customer = new Customer();
        Car car = new Car();
        
        System.out.println("bookingId");
        bookingId = Long.parseLong(br.readLine());
        
        System.out.println("dateTimeOfService");
        dateTimeOfService = (br.readLine());
        
        System.out.println("paymentMode");
        paymentMode = (br.readLine());
        
        System.out.println("customer id");
        customer.setCustomerId(Long.parseLong(br.readLine()));
        
        System.out.println("licence number");
        car.setLicenceNumber(br.readLine());
        
        System.out.println("amount");
        amount = Double.parseDouble(br.readLine());
        
        System.out.println("service engineer");
        serviceEngineer = (br.readLine());
        
        Booking booking = new Booking(bookingId,sdf.parse(dateTimeOfService),paymentMode,customer,car,amount,serviceEngineer);
        
        PaymentMode paymentModeIns = null;
        
        switch (booking.getPaymentMode()) {
            case "creditcardpayment":
                System.out.println("creditcard number");
                creditcardNumber = (br.readLine());
                System.out.println("holder name");
                holderName = (br.readLine());
                System.out.println("card number");
                cardNumber = (br.readLine());
                System.out.println("date of expiry");
                dateOfExpiry=br.readLine();
                paymentModeIns=new CreditCardPayment(creditcardNumber, holderName, cardNumber, sdf.parse(dateOfExpiry));
                break;
            case "walletpayment":
                System.out.println("wallet number");
                walletNumber = (br.readLine());
                paymentModeIns=new WalletPayment(walletNumber);
        }
       System.out.println("Cost is Rs "+new DecimalFormat("#").format(paymentModeIns.makePayment(booking)));
    }
}
