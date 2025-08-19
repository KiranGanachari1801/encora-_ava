package com.project_1;

class Address{
	int doorno;
	String Stradrs;
	String city;
	Address(int doorno,String Stradrs,String city){
		this.doorno=doorno;
		this.Stradrs=Stradrs;
		this.city=city;
		
	}
}
public class Employee {
int id;
String Name;
Address address;
public Employee(int id,String Name,Address address) {
	this.id=id;
	this. Name= Name;
	this.address=address;
}

void printdetails() {
	System.out.println("name is "+Name+" "+id);
}
}
