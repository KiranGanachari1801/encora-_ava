package com.project_1;

class FaildExeception extends Exception{
	public FaildExeception(String UPI)
	{
		System.out.println("upi payment failed \n"+UPI);
	}
	public void FaildExeception1(String Processsing)
	{
		System.out.println("processing  payment failed \n"+ Processsing);
	}
}

public class PaymentExp {
	static void payment(int PIN,String Processing) throws FaildExeception  {
		
		if(PIN!=1234) {
			throw new FaildExeception("you enter the wrong  pass");
		}
		else if(Processing=="Faild") {
			throw new FaildExeception("the payment under process");
			
		}else {
			System.out.println("you entered the correct  pass");
		}		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			payment(123,"Faild");
		}catch(Exception e){
			System.out.println(e);
			
		}
		
		
	}
}
