import java.util.List;

public class Item {
    
	private Long id;
	private String name;
	
	private Double cost;
	private int quantity;
	
	
	
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

	

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}


	

	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item() {
		super();
	}

	

	public Item(Long id, String name, Double cost, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	public static Double calculateTotalBill(List<Item> itemList) {
		double d=0;
		 for (int i = 0; i <itemList.size(); i++) {
				d=d+itemList.get(i).getCost()*itemList.get(i).getQuantity();
			}
		
		
		return d;
    }
    
    public static Double calculateTotalBill(List<Item> itemList, Integer deliveryType) {
        double d=0,tot=0,dt=0;
        for (int i = 0; i <itemList.size(); i++) {
			d=d+itemList.get(i).getCost()*itemList.get(i).getQuantity();
		}
        if(deliveryType==1)
        {
        	tot=d*(0.15);
        	
        	dt=d+tot;
        }
        if(deliveryType==2)
        {
        	tot=d*(0.08);
        	dt=d+tot;
        }
		return dt;
    }
    
}
