import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Item> itemList = new ArrayList<Item>();
        System.out.println("Enter the number of items:");
        Integer noOfItems = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < noOfItems ; i++) {
            String itemDetails = br.readLine();
            String[] splited = itemDetails.split(",");
            itemList.add(new Item(Long.parseLong(splited[0]), splited[1], Double.parseDouble(splited[2]), Integer.parseInt(splited[3])));
        }
        System.out.println("1.Store\n2.Online\nEnter the choice:");
        int n=Integer.parseInt(br.readLine());
        switch(n)
        {
        case 1:
        	double d=Item.calculateTotalBill(itemList);
        	
        	System.out.printf("Total amount:%.2f",d);
        	break;
        case 2:
        	System.out.println("1.One day delivery");
        	System.out.println("2.Normal delivery");
        	System.out.println("Enter delivery type:");
        	int deliveryType=Integer.parseInt(br.readLine());
        	double d1=Item.calculateTotalBill(itemList, deliveryType);
        	System.out.printf("Total amount:%.2f",d1);
        	
        	break;
        }
    }
}
