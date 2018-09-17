package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchDemo {

	public static void main(String[] args) {

		List<Object> objects = new ArrayList<>();

		objects.add(1000);
		objects.add(5000);
		objects.add(6000);
		objects.add(2000);
		objects.add(8000);

		// make objects collection as 'synchronized'

		Collections.synchronizedList(objects);

	}

}
