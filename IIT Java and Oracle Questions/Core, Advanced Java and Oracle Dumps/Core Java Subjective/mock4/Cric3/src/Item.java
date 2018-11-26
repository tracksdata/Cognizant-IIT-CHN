import java.util.ArrayList;
import java.util.List;

public class Item {

	private Long id;
	private String name;
	private String itemCode;
	private Double cost;
	
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	
	
	public Item(Long id, String name, String itemCode, Double cost) {
		super();
		this.id = id;
		this.name = name;
		this.itemCode = itemCode;
		this.cost = cost;
	}

	
	
	


	public Item() {
		super();
	}

	public static Item createItem(String itemDetail) {
        String str[]=itemDetail.split(",");
        Item i=new Item(Long.parseLong(str[0]),str[1], str[2], Double.parseDouble(str[3]));
		return i;
    }
    
    public static Item searchItemByName(String itemName, List<Item> itemList) {
        
    	Item it=null;
    	for (int i = 0; i <itemList.size(); i++) {
			
    		if(itemList.get(i).getName().equals(itemName))
    		{
    			it=new Item();
    			it=itemList.get(i);
    			
    		}
		}
		return it;

    }
    
    public static List<Item> findAllItemByPriceRange(List<Item> itemList, Double minRate, Double maxRate) {
    	List<Item> li=new ArrayList<>();
    	
    	for (int i = 0; i < itemList.size(); i++) {
			if(itemList.get(i).getCost()>=minRate&&itemList.get(i).getCost()<=maxRate)
			{
				Item it=itemList.get(i);
				li.add(it);
			}
		}
    	
		return li;
    }
    
}
