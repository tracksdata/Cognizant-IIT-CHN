package com;

public class EnumAccessDemo {
	enum Gender {
		MALE, FEMALE, BOTH;
	}

	public static void main(String[] args) {

		MyCities mc = MyCities.HYD;
		System.out.println(mc);
		System.out.println(Gender.MALE);
		
		MyCities cities[]=MyCities.values();
		
		
		for(MyCities city:cities) {
			System.out.println(city +" At "+city.ordinal());
		}

	}

}
