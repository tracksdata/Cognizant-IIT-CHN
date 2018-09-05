import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new TreeMap<String, Integer>();
        System.out.println("Enter the number of purchase:");
        List<String> st=new ArrayList<>();
        Integer purchaseCount = Integer.parseInt(buff.readLine());
        for(int i=0;i<purchaseCount;i++)
        {
        	String s=buff.readLine();
        	
        	Purchase.obtainPurchaseWithItem(map,s);
        }
       
        System.out.format("%-15s %s\n","Item name","Quantity");
        for(Map.Entry<String, Integer> mp:map.entrySet())
		{
			  System.out.format("%-15s %s\n",mp.getKey(),mp.getValue());
		}
    }
}
