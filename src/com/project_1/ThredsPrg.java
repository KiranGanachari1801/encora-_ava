package com.project_1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*class WorkerThread extends Thread{
	private String Name;
	public WorkerThread (String Name) {
		this.Name=Name;
	}
	public void run() {
		super.run();
		System.out.println("worker thread is running");
		Thread.currentThread().setName(Name);
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<=5;i++) {
			System.out.println("high priority thread"+i);
	}
		}
}


 
  class WorkerThread1 implements Runnable{
  
  @Override public void run() { 
	  System.out.println("worker thread is running");
	  for(int i=0;i<=5;i++) {
	  System.out.println("low priority thread"+i); 
	  }
  
  }
  
  }*/
 
/*class MyThread extends Thread{
	private String Name;
	public MyThread(String Name) {
		this.Name=Name;
		
	}
	public void run() {
		super.run();
		for(int i=0;i<=10;i++) {
			System.out.println("thread"+Name+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			}
}*/
class MyTask extends Thread{
	private String Name;
	public MyTask(String Name) {
		this.Name=Name;
		
	}
	public void run() {
		super.run();
		for(int i=0;i<=10;i++) {
			System.out.println("thread"+Name+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			}
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("data is cleard");
	}
	
}
public class ThredsPrg {
	
	
	
	public static void main(String[] args) {

		/*
		 * System.out.println(Thread.currentThread().getName());
		 * Thread.currentThread().setName("main_thread");
		 * System.out.println(Thread.currentThread().getName());
		 * System.out.println(Thread.currentThread().getId());
		 * System.out.println(Runtime.getRuntime().availableProcessors());
		 * System.out.println(Thread.currentThread().getState());
		 
		var WorkerThread = new WorkerThread("worker thread one");
		WorkerThread.setPriority(Thread.MAX_PRIORITY);
		WorkerThread.start();
		
		 * var WorkerThreadone=new WorkerThread1(); Thread myThread=new
		 * Thread(WorkerThreadone); myThread.setPriority(Thread.MIN_PRIORITY);
		 * myThread.start();
		 */

		/*
		 * var myThread2=new Thread(()->{
		 * System.out.println("lambda function on thread");
		 * 
		 * }); myThread2.start(); Runnable r1=new WorkerThread1(); Thread t1=new
		 * Thread(r1,"new Thread"); t1.start();
		 * System.out.println("thru runnable--"+t1.getName());
		 */
		/*
		 * Thread downloadingThread=new Thread(()->{
		 * System.out.println("downloading a file"); for(int i=0;i<=10;i++) { try{
		 * Thread.sleep(1000); System.out.println("downloading data---"+i);
		 * }catch(InterruptedException e) {
		 * System.out.println("downloading was interripted"); }
		 * 
		 * } });
		 * 
		 * downloadingThread.start();
		 * 
		 * var buttonThread=new Thread(()->{ try{ Thread.sleep(3000);
		 * downloadingThread.interrupt(); }catch(InterruptedException e) {
		 * e.printStackTrace(); } }); buttonThread.start();
		 */
		
		
				
		/*
		 * var t2=new MyThread("thread two"); var t3=new MyThread("thread three");
		 * t1.setDaemon(true); t1.start();
		 * 
		 * try { t1.join(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } t2.start(); try { t2.join(); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		/*
		 * var t1=new MyTask("thread one"); ExecutorService
		 * executor=Executors.newFixedThreadPool(2);
		 * System.out.println("submitting the tasks...");
		 * 
		 * for(int i=0;i<=5;i++) { executor.submit(new MyTask("task"+i)); }
		 * System.out.println("all task submited..."); executor.shutdown();
		 */
		
		var t1=new MyTask("task");
		t1=null;
		System.gc();
				
		
	}

}
