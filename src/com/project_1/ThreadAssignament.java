package com.project_1;

import java.util.Scanner;

class Bank extends Thread{
	private String Name;
	public Bank(String Name) {
		this.Name=Name;
	}
	public String withdraw() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the amount:");
		int amt=scanner.nextInt();
		
		System.out.println("amount withdraw "+Name+" "+amt);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Name;
	}

	public String deposit() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the amount:");
		int amt=scanner.nextInt();
		System.out.println("amount deposit "+Name+" "+amt);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Name;
	}
}

public class ThreadAssignament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var b1=new Bank("SBI");
		var b2=new Bank("SBI");
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the opetration: ");
		String operation=scanner.next();
		
	
		if(operation.equals(b1.withdraw())) {
			b1.start();
		try {
			b1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}b1.stop();
		}
		else if(operation.equals(b2.deposit())) {
			b2.start();
		try {
			b2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}b2.stop();
		}
		else {
			System.out.println("enter the correct opertaion");
		}
		
		
	}

}
