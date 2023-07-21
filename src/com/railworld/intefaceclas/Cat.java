package com.railworld.intefaceclas;

public class Cat implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating fish.");
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Cat is making noise meow meow.....");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cat is walking");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Cat is sleeping...");
		
	}

}
