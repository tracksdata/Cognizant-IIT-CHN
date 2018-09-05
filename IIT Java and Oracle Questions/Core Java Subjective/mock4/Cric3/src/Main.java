import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Item> itemList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. Add items\n2. Search item by name\n3. Get item between price range\n4. Exit\nEnter your choice:");
        Integer choice = Integer.parseInt(br.readLine());
        do {
	        switch (choice) {
	            case 1:
	                System.out.println("Enter the number of items:");
	                Integer noOfItems = Integer.parseInt(br.readLine());
	                for (int i = 0; i < noOfItems; i++) {
	                    Item item = Item.createItem(br.readLine());
	                    itemList.add(item);
	                }
	                break;
	            case 2:
	                System.out.println("Enter the name:");
	                String nm=br.readLine();
	               Item i1= Item.searchItemByName(nm, itemList);
	               if(i1!=null)
	               {
	            	  System.out.format("Item Detail\nItem name: " +i1.getName() + "\nItem code: " + i1.getItemCode()
				+ "\nItem Cost: " + i1.getCost()+"\n");
	               }
	               else
	               {
	               System.out.println("Item "+nm+" not found");
	               }
	               break;
	            case 3:
	                System.out.println("Enter the min and max cost:");
	                double min=Double.parseDouble(br.readLine());
	                double max=Double.parseDouble(br.readLine());
	                List<Item> li= Item.findAllItemByPriceRange(itemList, min, max);
	                
	                System.out.format("%-10s %-10s %s\n", "Name", "Code", "Cost");
	                	for (int i = 0; i < li.size(); i++) {
	                		
	                		System.out.format("%-10s %-10s %s\n", li.get(i).getName(),li.get(i).getItemCode(), li.get(i).getCost());
						}
	                	break;
	                
	            case 4:
	                System.exit(0);
	        }

	        System.out.println("1. Add items\n2. Search item by name\n3. Get item between price range\n4. Exit\nEnter your choice:");
	        choice = Integer.parseInt(br.readLine());
        }while(choice!=4);
    }

}
