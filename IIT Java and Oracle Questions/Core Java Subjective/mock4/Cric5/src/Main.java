import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException, ParseException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String currentLine;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		List<Purchase> purchases = new ArrayList<Purchase>();
		System.out.println("Enter the number of purchase:");
		Integer purchaseCount = Integer.parseInt(buff.readLine());
		System.out.println("Enter the purchase details:");
		for(int i=0;i<purchaseCount;i++)
		{
		try{
		
		
		String s=buff.readLine();
		Purchase p=Purchase.obtainPurchaseWithAmount(s);
		purchases.add(p);
		System.out.println("Purchase "+p.getId()+" is added to the list");
		
		}
		catch(InvalidWholeSaleException e)
		{
			System.out.println(e);
		}
		}
		Collections.sort(purchases);
		System.out.println("Whole sale purchases:");
		System.out.format("%-10s %-15s %s\n","ID","User","Amount");
		
		for (int i = 0; i < purchases.size(); i++) {
			System.out.format("%-10s %-15s %s\n",purchases.get(i).getId(),purchases.get(i).getUser(),purchases.get(i).getTotalAmount());
		}
		
	}
}
