package com.project_1;
import java.util.Scanner;
/*class Tiger{
	String name="Howdu Huliya";
	int age=22;
	static String City;
	Tiger(String myCity){
		this.City =myCity;
		System.out.println("tiger is from "+City+" age is "+age);
	}
	Tiger(int age,int id,String city){
		this(city);
		System.out.println("Tiger is "+id);
		
	}
	void roring() {
		System.out.println("Jai Huli");
		
	}
 class Lion{
	void playing() {
		System.out.println("lion is from "+City);
	}
}


class Banking{
	String name;

	Banking(double Depositamt){
		
		System.out.println("deposit your amount"+Depositamt+" "+ name);
		
	}
	Banking(int withdraw,double Depositamt){
		this(Depositamt);
		
		System.out.println("withdraw your amount "+withdraw +" "+ name);
		
	}
}*/

public class ThirdDay {

	public static void main(String[] args) {

		// Tiger tiger=new Tiger(" bangalore");

		/*
		 * Tiger tiger=new Tiger(20,30,"Bangalore"); System.out.println(tiger.name);
		 * Tiger.Lion lion=tiger.new Lion(); lion.playing();
		 */
		// Tiger.Lion lion=new Tiger.Lion();
		/* Banking bank=new Banking(2000,3000); */
		/*
		 * Cub cub=new Cub(); cub.roring();
		 */
		/*
		 * Address add=new Address(20,"MG Road","Bang");
		 * 
		 * Employee emp1=new Employee(10,"Kiran",add); emp1.printdetails();
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the your age");
		int age=scanner.nextInt();
		System.out.println("entert the country name");
		String country=scanner.next();
		
		IndiaTax person1 = new IndiaTax(age, country);
		person1.printdetails();
        person1.Calind();
        
		/*
		 * UsaTax person2=new UsaTax(30,"Usa"); person2.printdetails();
		 * person2.calUsa();
		 */
	}
}
