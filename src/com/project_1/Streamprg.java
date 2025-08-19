package com.project_1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var list=Arrays.asList("cat","rat","dog","paly","rat");
		/*
		 * for(String Name:list) { if(Name.contains("a")) { System.out.println(true);}
		 * 
		 * }
		 */
		/*
		 * var res= list.stream().anyMatch(element->element.contains("a"));
		 * System.out.println(res); var res1= list.stream().allMatch((kiran)->{return
		 * kiran.contains("a");}); System.out.println(res1);
		 * 
		 * list.stream() .filter(element->element.contains("a"))
		 * .forEach(System.out::println); var filterdata=list.stream()
		 * .filter(element->element.contains("o")) .map(el->el.toUpperCase())
		 * .collect(Collectors.toList()); //.forEach(e->System.out.println(e));
		 * System.out.println(filterdata);
		 * System.out.println(filterdata.stream().count());
		 * 
		 * 
		 * var num=List.of(1,6,10); var reduceres=num.stream()
		 * .reduce(10,(summer,ele)->summer+ele);
		 * 
		 * System.out.println(reduceres);
		 */
		/*
		 * IntStream intstream=IntStream.range(0, 100);
		 * intstream.forEach(System.out::println);
		 */
		/*
		 * AtomicInteger counter=new AtomicInteger(1);
		 * 
		 * var
		 * Streamstring=Stream.generate(()->"items --"+counter.getAndIncrement()).limit(
		 * 10); Streamstring.forEach(System.out::println);
		 */
		
		
		int[] num=IntStream.range(1, 1000000000).toArray();
		var starttime=System.currentTimeMillis();
		var ops=IntStream.of(num).sum();
		var StopTime=System.currentTimeMillis();
		System.out.println("time taken by Normal process--"+(StopTime-starttime)+" ms");
	

		
		var pstarttime=System.currentTimeMillis();
		var pops=IntStream.of(num).parallel().sum();
		var pStopTime=System.currentTimeMillis();
		System.out.println("time taken by Paralle process--"+(pStopTime-pstarttime)+" ms");
	}

}
