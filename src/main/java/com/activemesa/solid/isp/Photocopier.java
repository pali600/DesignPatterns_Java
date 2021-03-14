package com.activemesa.solid.isp;

public class Photocopier implements Printer, IScanner {
	@Override
	public void scan( Document d ) throws Exception {
		throw new Exception();
	}

	@Override
	public void print( Document d ) throws Exception {
		throw new Exception();
	}
}
