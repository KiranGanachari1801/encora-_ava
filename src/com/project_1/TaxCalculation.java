package com.project_1;

import java.util.Scanner;

class Tax{
	int age;
	String country;
	
	Tax(int age, String country){
		this.age = age;
		this.country = country;
		
	}
	void printdetails() {
		System.out.println("your age is "+age+" Your country is "+country);
	}
}

 class IndiaTax extends Tax{
	 IndiaTax(int age, String country) {
			super(age, country);
	 }
	 
	 void Calind() {
	   if(age>=30 )

	{
		System.out.println("pay tax 40% ");
	}
		 
	else  {
		System.out.println("pay tax 50% ");
	}
	   }
	
	 }
	
 class UsaTax extends Tax{
	UsaTax(int age, String country) {
			super(age, country);
			
	}
void calUsa() {	
	
		if(age>=40 )
		
	{
		System.out.println("pay tax 30% ");
	}
		else {
		System.out.println("pay tax 20% ");
	}
	}
	
	
}
 public class TaxCalculation {

		public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
 	System.out.println("enter your name");
 	String name=scanner.next();
	System.out.println("enter the your age");
	int age=scanner.nextInt();
	System.out.println("entert the country name");
	String country=scanner.next();
	
	if(country.equalsIgnoreCase("india")) {
	IndiaTax person1 = new IndiaTax(age, country);
	person1.printdetails();
	person1.Calind();
	}
	else if(country.equalsIgnoreCase("Usa")) {
		
		UsaTax person2=new UsaTax(30,"Usa");
		person2.printdetails();
		  person2.calUsa();
	}
	else {
		System.out.println("enter the correct country name");
	}
 scanner.close();
 
		}
		
 }

