package com.activemesa.solid.isp;

public class MultiFunctionMachine implements MultiFunctionDevice {

	// compose this out of several modules
	private Printer printer;
	private IScanner scanner;

	public MultiFunctionMachine( Printer printer, IScanner scanner ) {
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void scan( Document d ) throws Exception {
		printer.print( d );
	}

	@Override
	public void print( Document d ) throws Exception {
		scanner.scan( d );
	}
}
