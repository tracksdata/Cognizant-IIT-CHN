package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex3 {

	public static void main(String[] args) {

		List<String> menu = new ArrayList<>();
		menu.add("biryani");
		menu.add("biryani");
		menu.add("meals");
		menu.add("biryani");
		menu.add("biryani");
		menu.add("idly");
		menu.add("biryani");
		menu.add("vada");

		// imperative style ( Qhat + How )

//		Iterator<String> iterator = menu.iterator();
//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			if (string.equals("biryani"))
//				iterator.remove();
//		}

		// functional style ( What )
		menu.removeIf(item -> item.equals("biryani"));

		System.out.println(menu);

	}

}
