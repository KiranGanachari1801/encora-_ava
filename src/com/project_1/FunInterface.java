package com.project_1;

/*interface Myfuninterface{
	void MyMethod();
}
interface calculationintefrace{
	int calcuating(int a,int b);
}*/

import java.util.stream.IntStream;

@FunctionalInterface
interface Myfunctionalinterfac {
	void Mymethod();
}

@FunctionalInterface
interface CalculationInterface {
	int calculating(int a, int b);
}

public class FunInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Myfuninterface myfun=new Myfuninterface() { public void MyMethod() {
		 * System.out.println("functional interface normal method"); } };
		 * 
		 * Myfuninterface lambdafun=()-> System.out.println("Lambda Fun ");
		 * 
		 * myfun.MyMethod(); lambdafun.MyMethod();
		 * 
		 * calculationintefrace adding=(a,b)->a+b;
		 * System.out.println(adding.calcuating(10 ,3));
		 */
		

	// Original interface usage
				Myfunctionalinterfac myFunInterface = new Myfunctionalinterfac() {
					public void Mymethod() {
						System.out.println("Functional interface Normal Method");
					}
				};

				Myfunctionalinterfac lambdaFun = () -> System.out.println("LAMBDA FUNCTION");

				myFunInterface.Mymethod();
				lambdaFun.Mymethod();

				CalculationInterface adding = (a, b) -> a + b;
				System.out.println("Sum using CalculationInterface: " + adding.calculating(4, 5));

				

				int result = IntStream.rangeClosed(1, 1000)
						.filter(FunInterface::isPrime)      
						.map(n -> (n + 1) / 2)                    
						.sum();                                     

				System.out.println("Final Result (Sum of processed primes): " + result);
			}

			
			public static boolean isPrime(int number) {
				if (number <= 1) return false;
				if (number == 2) return true;
				if (number % 2 == 0) return false;
				for (int i = 3; i <= Math.sqrt(number); i += 2) {
					if (number % i == 0) return false;
				}
				return true;
			}
		

		
	

}
