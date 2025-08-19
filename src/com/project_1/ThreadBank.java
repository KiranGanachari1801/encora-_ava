package com.project_1;

import java.util.Scanner;

class Banking{
	
	synchronized static void tranaction(String fromacc,String Toacc,int amount) {
		System.out.printf(" %d Rs is transformed from %s account to %s account \n",amount,fromacc,Toacc);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	static void faild() {
		System.out.println(" tranaction faild");
	}
}

public class ThreadBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the name of Sender:");
		String fromacc=scanner.nextLine();
		System.out.println("enter the name of Reciver:");
		String Toacc=scanner.nextLine();
		System.out.println("enter the amount:");
		int amount=scanner.nextInt();
		
		
		var user11=new Thread(()-> {
			
			Banking.tranaction(fromacc, Toacc,amount);
			Banking.faild();
		});
		//user11.setPriority(Thread.MAX_PRIORITY);
		user11.start();
		
		
		var user21=new Thread(()-> {
			Banking.tranaction("prajwal", "chintu",2000);
		});
		user21.start();
		
		
		
		
		
		
	}

}
