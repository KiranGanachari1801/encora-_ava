package com.project_1;

interface Vehicle{
	
	 void Start();
	 void Stop();
	default void honcking() {
		System.out.println("Vehicle is honcking");
	}
	static void breaking() {
		System.out.println("vehicle is breaking");
	}
}

class BMW implements Vehicle{
	public void Start() {
		System.out.println("BMW Car Started");
	}
	public void Stop() {
		System.out.println("BMW Stop");
	}
}

public class InterfacePrg {

	public static void main(String[] args) {
		
		BMW M=new BMW();
		M.honcking();
		M.Start();
		M.Stop();
		
		Vehicle BMWCar=new BMW();
		
		Vehicle.breaking();

	}

}
