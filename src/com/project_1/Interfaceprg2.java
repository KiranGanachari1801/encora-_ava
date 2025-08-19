package com.project_1;


interface Vehicle1{
	 void Start();
	 void Stop();
	default void honcking() {
		System.out.println("Vehicle is honcking");
	}
	static void breaking() {
		System.out.println("vehicle is breaking");
	}
}

interface Car extends Vehicle1{
	void Brand();
	void Segment();
	 void Start();
	 void Stop();
}

interface Number extends Vehicle1,Car{
	void Numberplate();
	
}
class BMW1 implements  Vehicle1,Car,Number{
	public void Start() {
		System.out.println("Bmw Car Started");
	}
	public void Stop() {
		System.out.println("Bmw Stop");
	}
	public void Brand() {
		System.out.println("BMW");
	}
	public void Segment() {
		System.out.println("SUV");
	}
	public void Numberplate() {
		System.out.println("KA04VL1801");
	}
}
public class Interfaceprg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW1 B=new BMW1();
		B.Start();
		B.Stop();
		B.Brand();
		B.Segment();
		B.Numberplate();
		
	}

}
