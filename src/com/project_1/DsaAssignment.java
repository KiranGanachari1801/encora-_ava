package com.project_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/*class Students<T>{
	T Name;
	T Marks1;
	T Marks2;
	void setcontent(T Name,T Marks1,T Marks2) {
		this.Name=Name;
		this.Marks1=Marks1;
		this.Marks2=Marks2;
	}
	
	
	void getdata() {
		System.out.println(Name +" "+Marks1+" "+Marks2);	
		
	}
	
}*/

/*record Student(String Name,int Marks1,int Marks2) {};*/
public class DsaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Students mystd=new Students(); mystd.setcontent("kiran",20,30);
		 * mystd.getdata();
		 * 
		 * Students mystd1=new Students(); mystd1.setcontent("abhi",20,30);
		 * mystd1.getdata();
		 */
		/*
		 * var marksrecord=new Student("Kiran",10,20);
		 * 
		 * var marksrecord1=new Student("Abhi",20,20);
		 * System.out.println(marksrecord.equals(marksrecord1));
		 * System.out.println(marksrecord1.Name());
		 * System.out.println(marksrecord.toString()); System.out.println();
		 */
		
		/*
		 * var mySet=new HashSet<String>(); mySet.add("apple"); mySet.add("mango");
		 * System.out.println(mySet);
		 * 
		 * var mySet1=new LinkedHashSet<String>(); mySet1.add("1"); mySet1.add("2");
		 * mySet1.add("4"); mySet1.add("5"); System.out.println(mySet1); var mySet2=new
		 * TreeSet<String>(); mySet2.add("k"); mySet2.add("i"); mySet2.add("r");
		 * mySet2.add("a"); System.out.println(mySet2);
		 */
		Map<Integer,String> mymap=new HashMap<Integer,String>();
		mymap.put(1, "Kiran");
		mymap.put(2, "Abhi");
		mymap.put(3, "Buiiiii");
		mymap.put(4,"Prajuu Mamu");
		mymap.put(5,"Rajath");
		
		for(Map.Entry<Integer,String>entry:mymap.entrySet()) {
			System.out.println("key is"+entry.getKey()+"value is"+entry.getValue());
		}
		var value=mymap.get(1);
		System.out.println(value);
	}

}
