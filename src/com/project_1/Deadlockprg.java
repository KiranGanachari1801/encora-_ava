/*
 * package com.project_1;
 * 
 * public class Deadlockprg {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * final Object l1=new Object(); final Object l2=new Object();
 * 
 * Thread t1=new Thread(()->{ synchronized (l1) {
 * System.out.println("T1: holding l1..."); try { Thread.sleep(3000); } catch
 * (InterruptedException e1) {} System.out.println("T2: wating for L1... ");
 * synchronized (l2) { System.out.println("T2: Holding L2.."); } } }); Thread
 * t2=new Thread(()->{ synchronized (l2) {
 * System.out.println("T2: holding l2..."); try { Thread.sleep(3000); } catch
 * (InterruptedException e1) {} System.out.println("T1: wating for L2... ");
 * synchronized (l1) { System.out.println("T1: Holding L1.."); } } });
 * 
 * t1.start(); t2.start(); } }
 */
/*
 * package com.project_1;
 * 
 * public class Deadlockprg {
 * 
 * public static void main(String[] args) { final Object l1 = new Object();
 * final Object l2 = new Object();
 * 
 * Thread t1 = new Thread(() -> { synchronized (l1) {
 * System.out.println("T1: holding l1..."); try { Thread.sleep(3000); } catch
 * (InterruptedException e1) {}
 * 
 * System.out.println("T1: waiting for l2..."); synchronized (l2) {
 * System.out.println("T1: holding l2..."); } } });
 * 
 * Thread t2 = new Thread(() -> { synchronized (l1) {
 * System.out.println("T2: holding l1..."); try { Thread.sleep(3000); } catch
 * (InterruptedException e1) {}
 * 
 * System.out.println("T2: waiting for l2..."); synchronized (l2) {
 * System.out.println("T2: holding l2..."); } } });
 * 
 * t1.start(); t2.start(); } }
 */
package com.project_1;

class SharedState {
    public static final Object lock = new Object();
    public static boolean dataReady = false;
}

public class Deadlockprg {
    public static void main(String[] args) {
        // Consumer thread (main thread)
        Thread consumer = new Thread(() -> {
            synchronized (SharedState.lock) {
                while (!SharedState.dataReady) {
                    try {
                        System.out.println("Consumer: Data not ready, waiting...");
                        SharedState.lock.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Consumer: Interrupted while waiting.");
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Consumer: Data is ready, consuming...");
            }
        });

        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate data preparation
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            synchronized (SharedState.lock) {
                SharedState.dataReady = true;
                System.out.println("Producer: Data is ready, notifying...");
                SharedState.lock.notify();
            }
        });

        consumer.start();
        producer.start();
        
        try {
			consumer.join();
			producer.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    }
}