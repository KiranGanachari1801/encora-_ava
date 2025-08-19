package com.project_1;

abstract class Encora{
	abstract void Security();
	abstract void Mask();
	void havinglunch() {
		System.out.println("Having lunch in office");
	}
}


class Batch1 extends Encora{
	void Security() {
		System.out.println("scan the fingerprint");
		
	}
	void Mask() {
		System.out.println("they need to ware mask");
	}
	
}

class Batch2 extends Encora{
	void Security() {
		System.out.println("scan the fingerprint");
		
	}
	void Mask() {
		System.out.println("they need to ware mask");
	}
	
}
public class FourthDay {

	public static void main(String[] args) {
		Batch1 b1=new Batch1();
		b1.Security();
		b1.havinglunch();

	}

}
