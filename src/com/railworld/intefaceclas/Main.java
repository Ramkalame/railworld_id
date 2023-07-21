package com.railworld.intefaceclas;

public class Main {

	public static void main(String[] args) {
		
		
		Animal cat1 = new Cat();
		
		cat1.eat();
		cat1.makeNoise();
		cat1.walk();
		cat1.sleep();
		
		Animal dog1 = new Dog();
		
		dog1.eat();
		dog1.makeNoise();
		dog1.walk();
		dog1.sleep();
		
		Animal elephent1 = new Elephent();
		
		elephent1.eat();
		elephent1.makeNoise();
		elephent1.walk();
		elephent1.sleep();

	}

}
