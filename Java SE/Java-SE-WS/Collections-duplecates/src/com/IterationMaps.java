package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterationMaps {

	public static void main(String[] args) {

		Map<Integer, String> cities = new HashMap<>();
		cities.put(10, "Hyderabad");
		cities.put(13, "Pune");
		cities.put(12, "Bangalore");
		cities.put(11, "Mangalore");
		cities.put(19, "Chennai");
		cities.put(14, "North Goa");
		cities.put(12, "Kolkata");
		cities.put(18, "Pune");

		
		// Copy all Map keys to set interface
		// keySet method
		
		Set<Integer> keys=cities.keySet();
		
		// get values of a map using keys 
		
		for(Integer key:keys) {
			System.out.println(cities.get(key));
		}
		
		System.out.println("-----------------");
		// copy keys and values to the set intererface
		// entrySet
		
		Set<Map.Entry<Integer, String>> values=cities.entrySet();
		
		for(Object obj:values) {
			System.out.println(obj);
		}
		
		
		
		
		
		
		
		
		

	}

}
