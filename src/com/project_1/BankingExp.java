package com.project_1;

interface Payment{
	 void Paymentmethod(int id,double amt);
}
class UPI implements Payment{

	@Override
	public void Paymentmethod(int id, double amt) {
		
		System.out.println("payment is done By Upi"+" Id is "+id+" amount is "+amt);
	}
}
class Card implements Payment{

	@Override
	public void Paymentmethod(int id, double amt) {
		
		System.out.println("payment is done By Card"+" Id is "+id+" amount is "+amt);	
	}
	
}
class SendBy {
	Payment Send;
	SendBy(Payment Send) {
		this.Send=Send;
	}
	void SendAmt(int id, double amt) {
		Send.Paymentmethod(id, amt);
	}
}
public class BankingExp {

	public static void main(String[] args) {
		
		SendBy U1PI=new SendBy(new UPI());
		U1PI.SendAmt(100, 50000.10);
	}

}
