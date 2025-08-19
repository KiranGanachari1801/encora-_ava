package com.project_1;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.*;

import java.util.Scanner;
public class MyFunction {

	static void ClaculateTax(String CountryName,int age){
	
		switch(CountryName) {
		case "USA": 
			if(age<50) {
			System.out.println("you need to pay 40% tax");
			}
			else {
				System.out.println("you need to pay 20% tax");
				
			}
			break;
			
		case "India":
			if(age<50) {
				System.out.println("You need to pay 20% tax");
			}
			else {
			System.out.println("You need to pay 10% tax");
			break;
			}
		default:System.out.println("enter the corret Country Name");
		}
		
		
			
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the age ");
		int age=scanner.nextInt();
		System.out.println("enter the country name");
		String Country=scanner.next();
		
		
		ClaculateTax(Country,age);
	
	
		
		

	}

}
