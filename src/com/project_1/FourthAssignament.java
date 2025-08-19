package com.project_1;



abstract class RBI{
	abstract void Id();
	abstract void Amount();
	void Name() {
		System.out.println("enter the bank name");
	}
}

class SBI extends RBI{
	void Id() {
		System.out.println("ID is 5342");
	}
	void Amount() {
		System.out.println("10cr");
	}
}
class HDFC extends RBI{
	void Id() {
		System.out.println("ID is 5382");
	}
	void Amount() {
		System.out.println("100cr");
	}
}
public class FourthAssignament {

	public static void main(String[] args) {
		HDFC bank=new HDFC();
		bank.Id();
		bank.Amount();

	}

}

