package com.activemesa.structural.decorator.exercise;

public class Dragon {

	private int age;
	private Bird bird;
	private Lizard lizard;

	public Dragon() {
		this.bird = new Bird();
		this.lizard = new Lizard();
	}

	public void setAge( int age ) {
		this.age = age;
		bird.age = age;
		lizard.age = age;
	}

	public String fly() {
		return bird.fly();
	}

	public String crawl() {
		return lizard.crawl();
	}
}
