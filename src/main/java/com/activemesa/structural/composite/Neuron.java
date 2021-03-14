package com.activemesa.structural.composite;

import java.util.*;
import java.util.function.Consumer;

public class Neuron implements SomeNeurons {
	public List<Neuron> in, out;

	public Neuron() {
		in = new ArrayList<>();
		out = new ArrayList<>();
	}

	@Override
	public Iterator<Neuron> iterator() {
		return Collections.singleton( this ).iterator();
	}

	@Override
	public void forEach( Consumer<? super Neuron> action ) {
		action.accept( this );
	}

	@Override
	public Spliterator<Neuron> spliterator() {
		return Collections.singleton( this ).spliterator();
	}

	//	public void connectTo( Neuron other ) {
//		out.add( other );
//		other.in.add( this );
//	}
}
