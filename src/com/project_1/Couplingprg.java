package com.project_1;

import java.util.Scanner;

interface Notify{
	void SendMsg(String recipent,String message);
	
}
class EmailMsg implements Notify{
	public void SendMsg(String recipent,String message) {
		System.out.println("Send mail msg "+recipent+" "+message);
	}
}
class SMSmsg implements Notify{
	public void SendMsg(String recipent,String message) {
		System.out.println("Send SMS msg"+recipent+" "+message);
	}
}
class Service{
	Notify notifer;
	 Service(Notify notifer) {
		this.notifer=notifer;
		
	}
	void sendnotifation(String recipent,String message) {
		notifer.SendMsg(recipent,message);
	}
}
public class Couplingprg {

	public static void main(String[] args) {
		
		
		Service SMSmsg =new Service(new SMSmsg());
		SMSmsg.sendnotifation("abs", "Hii");
	}

}
