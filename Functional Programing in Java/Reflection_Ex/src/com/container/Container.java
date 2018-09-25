package com.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.comps.UserComponent;

public class Container {

	public void processUrl(String url) {

		try {

			Class<?> clazz = Class.forName("com.comps.UserComponent");
			Object userComp = clazz.newInstance();

			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				RequestMapping rm = method.getAnnotation(RequestMapping.class);
				if (rm != null) {
					RequestMethod givenMethod = rm.method();
					String givenUrl = rm.url();
					if (url.equals(givenUrl)) {
						method.invoke(userComp, new Object[] { "Nag", "shhh" });
					}
				}
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
