package com.examples.util;

public interface Collection {

	// immutable state
	
	void add(String e);
	void clear();
	default void forEach() {
		// 
	};
	
}
