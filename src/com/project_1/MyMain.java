
package com.project_1;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.*;

import java.util.Scanner;
public class MyMain {

//	static int calculation(int a,int b,BiFunction<Integer,Integer,Integer> myFunc) {
//		return myFunc.apply(a, b);
//	}
	static String CalcuateTax(int age,String CountryName,BiFunction <Integer,String,String>Myfun ){
		return Myfun.apply(age,CountryName);
				
				
			
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int val=0; String op=args[0];
		 * 
		 * int a=Integer.parseInt(args[1]); int b=Integer.parseInt(args[2]);
		 * 
		 * 
		 * switch (op) {
		 * 
		 * case "+": val=a+b; System.out.println(val); break; case"-": val=a-b;
		 * System.out.println(val); break; case"/": val=a/b; System.out.println(val);
		 * break;
		 * 
		 * }
		 */
		
		/*String day="Mon";
		
		String myDay= switch(day) {
		case "Mon","Tus","Wed","Thu","Fri"->{
		System.out.println("It is working day");
		yield "Weekday";
		}
		
		case "sat","sun"->{
			System.out.println("It is not working day");
			yield "Weekend";
		}
		
		default->"invalid day";
		};
		System.out.println(myDay);
		
		}*/
		
   
		/*
		 * for(int i=0;i<=10;i++) { System.out.println(i);
		 * 
		 * 
		 * };
		 */
		
		/*
		 * Scanner Scanner=new Scanner(System.in);
		 * 
		 * System.out.println("Enter your name"); String name=Scanner.nextLine();
		 * 
		 * System.out.println("Enter your age"); int age=Scanner.nextInt();
		 * 
		 * System.out.printf("your name is %s and Age is %d",name,age); String res =
		 * String.format("your name is %s and Age is %d",name,age);
		 * System.out.println(res);
		 * 
		 * 
		 * System.out.printf( "%-10s , %15s \n" ,"Name","Age");
		 * System.out.printf("-------------------\n");
		 * System.out.printf("%-10s , %15d",name,age);
		 * 
		 */
	/*	Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter your name");String Name=Scanner.nextLine();
		String z;
	do	{
		System.out.println("Enter your Salary");int Salary=Scanner.nextInt();
		
		if(Salary<=100) {
			System.out.printf("%s you not need to pay tax %d",Name,Salary);
			
		}
		else if(Salary>=500 || Salary<=1000 ) {
				System.out.printf("%s ","you need to pay 10% tax   %d \n",Name,Salary);
			}
		else {
	 System.out.printf("%s"," you need to pay 20% tax  %d \n",Name,Salary);
		}
		
	
		System.out.println("do you want to countinue?");
		z=Scanner.next();
	}while(z.equalsIgnoreCase("yes"));
		
	
	Scanner.close();
	}	*/
	
		
/*	 Function<Integer,Integer> Square= x-> x * x;
	 System.out.println(Square.apply(5)); BiFunction<Integer,Integer,Integer> add
	 = (x,y) -> x + y; System.out.println(add.apply(5,6));
	 
	 int res =calculation(5,6,add);
			System.out.println(" Result is "+  res);
		
	}*/
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter your age"); int age=Scanner.nextInt();
		
		System.out.println("Enter your Country"); String CountryName=Scanner.next();
		BiFunction<Integer,String,String> CalcuateTax=(Age,Country) -> {
			
			
			if(Country.equals("India")) {
				if(Age>=50){
					return " No need to pay tax 10%";
				}
				else {
					return "You need to pay tax 20%";
				}
			}
			else if(Country.equals("USA")) {
				if(Age>=60){
					return "No need to pay tax 20%";
				}
				else {
					return "You need to pay tax 30%";
				}
				
			}
			else {
				
				return "enter the correct country name ";
			}
				
		};
		String result = CalcuateTax(age, CountryName, CalcuateTax);
        System.out.println(result);
	}
}
	

     
	


