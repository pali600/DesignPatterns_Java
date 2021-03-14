package com.activemesa.structural.composite.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyList extends ArrayList<ValueContainer> {

	// please leave this constructor as-is
	public MyList( Collection<? extends ValueContainer> c ) {
		super( c );
	}

	public int sum() {
		int sum = 0;
		for ( ValueContainer vc : this ) {
			Iterator<Integer> iterator = vc.iterator();
			while ( iterator.hasNext() ) {
				Integer value = iterator.next();
				sum += value;
			}
		}
		return sum;
	}
}
