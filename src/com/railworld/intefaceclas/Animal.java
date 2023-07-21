package com.railworld.intefaceclas;

public interface Animal {
	
	default void info() {
		System.out.println("This is animal interface class that have method about animals.");
		
		
	}
	public void eat();
	public void makeNoise();
	public void walk();
	public void sleep();

}
