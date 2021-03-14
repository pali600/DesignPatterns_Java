package com.activemesa.creational.builder.excercise;

public class CodeBuilder {
	private StringBuilder sb = new StringBuilder();

	public CodeBuilder( String className ) {
		sb.append( "public class " );
		sb.append( className );
		sb.append( "\n" );
		sb.append( "{" );
		sb.append( "\n" );
	}

	public CodeBuilder addField( String name, String type ) {
		sb.append( " " );
		sb.append( "public " );
		sb.append( type ).append( " " ).append( name ).append( ";" );
		sb.append( "\n" );
		return this;
	}

	@Override
	public String toString() {
		sb.append( "}" );
		sb.append( "\n" );
		return sb.toString();
	}
}
