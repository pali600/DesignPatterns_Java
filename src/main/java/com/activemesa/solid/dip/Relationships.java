package com.activemesa.solid.dip;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.javatuples.Triplet;

public class Relationships implements RelationshipBrowser {

	// Triplet class requires javatuples
	private List<Triplet<Person, Relationship, Person>> relations =
			new ArrayList<>();

	@Override
	public List<Person> findAllChildrenOf( String name ) {
		return relations.stream()
				.filter( x -> Objects.equals( x.getValue0().name, name )
						&& x.getValue1() == Relationship.PARENT )
				.map( Triplet::getValue2 )
				.collect( Collectors.toList() );
	}

	public List<Triplet<Person, Relationship, Person>> getRelations() {
		return relations;
	}

	public void addParentAndChild( Person parent, Person child ) {
		relations.add( new Triplet<>( parent, Relationship.PARENT, child ) );
		relations.add( new Triplet<>( child, Relationship.CHILD, parent ) );
	}
}
