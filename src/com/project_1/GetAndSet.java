package com.project_1;

class employee{
	private String Name;
	private int id;
	private int age;
	public String getName() {
		return Name;
	}
	public  int getid() {
		return id;
	}
	public int  getage() {
		return age;
	}
	public void  setage() {
		if(age<=0) {
			System.out.println("age should inval id");
		}
		else {
			this.age=age;
		}
	}
}
public class GetAndSet {

}
