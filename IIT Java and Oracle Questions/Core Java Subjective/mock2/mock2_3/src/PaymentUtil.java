import java.util.Map;
import java.util.Map.Entry;

public class PaymentUtil {
    
    public Double makePayment(Map<String,Float> bankTax,String bankName,Double amount)
    {
    	double g=0;
    	for(Map.Entry<String, Float> m:bankTax.entrySet())
    	{
    		if(m.getKey().equalsIgnoreCase(bankName))
    		{
    			g=amount+(amount*(m.getValue()/100));
    		}
    	}
    	
		return g;
        
    }
    
    public Double makePayment(Double amount)
    {
        Float serviceTax = 5.2f;
        Float vat = 2.3f;
        double d1=(double)(amount*(serviceTax/100));
        double d2=amount+d1;
        return d2+(d2*(vat/100));
    }
    
    public Double makePayment(Double amount, Float discountPercent)
    {
        double d1=amount-amount*discountPercent/100;
        return d1;
        
    }
    
}
