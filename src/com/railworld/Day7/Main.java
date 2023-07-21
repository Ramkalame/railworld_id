package com.railworld.Day7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the name of person :");
		String name = s.next();
		System.out.println("Enter the gender of person :");
		String gender = s.next();
		System.out.println("Enter the age of person :");
		int age = s.nextInt();
		System.out.println("Enter the address of person :");
		String address = s.next();
		
		Person p1 = new Person();
		
		p1.setName(name);
		p1.setGender(gender);
		p1.setAge(age);
		p1.setAddress(address);
		
		System.out.println(p1);
		

	}

}
