package com.airline.control;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineControl extends AirlineReservation {

	public static void main(String[] args) {
	
		AirlineControl air=new AirlineControl();
		air.setUsername("Anish");
		air.setPassword(789);
		air.setAddress("chennai");
		air.setAge(20);
		
		System.out.println("user name : "+air.getUsername());
		System.out.println("Password :"+air.getPassword());
		System.out.println("Age : "+air.getAge());
		System.out.println("Address :"+air.getAddress());
		
		System.out.println();
		System.out.println("................");
		try {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to EX-Airlines");
		
		Object[] user1= {"passsengerName - anish","AGE - 23","Address - chennai",1};
		Object[] user2= {"passsengerName - arun","AGE - 19","Address - trichy",2};
		Object[] user3= {"passsengerName - mike","AGE - 21","Address - madurai",3};
		Object[] user4= {"passsengerName - black","AGE - 32","Address - erode",4};
		Object[] user5= {"passsengerName - red","AGE - 25","Address - namakal",5};
		
		System.out.println("Enter the passenger details : ");
		int passdet = input.nextInt();
		switch(passdet){
		case 1:
			System.out.println(Arrays.toString(user1));
			break;
		case 2:
			System.out.println(Arrays.toString(user2));
			break;
		case 3:
			System.out.println(Arrays.toString(user3));
			break;
		case 4:
			System.out.println(Arrays.toString(user4));
           break;
		case 5:
			System.out.println(Arrays.toString(user5));
			break;

		}
		System.out.println("Enter journey date  1. AUGUST 2.SEPTEMBER :");
		int date=input.nextInt();
		 System.out.println();
		System.out.println("Choose Your preference : type '1' for First Class or '2' for Economy Class : ");
		int type = input.nextInt();
		 System.out.println();
		System.out.println(" Journey Routes a.KERALA b.BANGLORE c.HYDRABAD ");
		String place = input.next();
		 System.out.println();
		switch (type) {
		case 1:
			firstClass(place);
			break;
		case 2:
			economyClass(place);
			break;
		}
	}
	
	catch(Exception e) {
		System.out.println(e);
	}
}
}