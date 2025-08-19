package com.project_1;

import java.util.concurrent.ExecutionException;

class AgeExecption extends Exception{
	public AgeExecption(String age) {
		super("this is to deal with age \n"+age );
	}
}
public class ExpectionHandling {
	
	static void ValidateAge(int age) throws AgeExecption {
		if(age<18) {
			throw new AgeExecption("Your not eligible to vote ");
		}
		else {
			System.out.println("Your  eligible to vote ");
		}
	}
	public static void main(String[] args) {
		try {
			ValidateAge(16);
		}catch(Exception e) {
			System.out.println("Execption is:"+e);
		}
	}
		/*
		try {
			String name=null;
			System.out.println(name.length());
		
		 }catch(NullPointerException e){
				System.out.println("Execption is:"+e);
				
				
			}
		
		 try {
			var a=22;
			var b=0;
			var res=a/b;
			System.out.println(res);
			
		
		}
		catch(ArithmeticException e){
			System.out.println("Execption is:"+e);
			
			
		}
		catch(Exception e){
			System.out.println("Execption is:"+e);
			
		}	
		}
		*/
		
	}
	


