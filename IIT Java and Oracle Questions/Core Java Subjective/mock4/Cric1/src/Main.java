import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException, ParseException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		Item[] items = new Item[2];
		for(int i=0;i<2;i++) {
			System.out.println("Enter item "+(i+1)+" detail:");
			String details = buff.readLine();
			String [] itemVal = details.split(",");
			items[i] = new Item(Long.parseLong(itemVal[0]),itemVal[1],itemVal[2],Double.parseDouble(itemVal[3]));
		}
		
		
		System.out.println();
		for (int i = 0; i <2; i++) {
			
			System.out.println("Item "+(i+1)+":");
			System.out.format("%-5s %-15s %-15s %s\n", "ID","Name","Item Code","Cost");
			System.out.println(items[i]);
		}
		System.out.println();
		
		
		if(items[0].equals(items[1]))
		{
			System.out.println("Item 1 is same as Item 2 ");
		}
		else
		{
			System.out.println("Item 1 and Item 2 are different");
		}
	}
}

