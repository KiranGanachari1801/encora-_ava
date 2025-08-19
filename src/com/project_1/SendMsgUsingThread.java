package com.project_1;

class Sendermsg {
    
    static final Object lock = new Object();

    static void sendmsg(String msg) {
        synchronized (lock) {
            System.out.println("Sending msg: " + msg);
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sent msg " );
        }
    }
}

class SenderThread extends Thread {
    String msg;

    public SenderThread(String msg) {
        this.msg = msg;
    }

    public void run() {
        Sendermsg.sendmsg("Hello " + msg);
    }
}

public class SendMsgUsingThread {
    public static void main(String[] args) {
        SenderThread s1 = new SenderThread("Kiran");
        SenderThread s2 = new SenderThread("Ganachari");

        s1.start();
        s2.start();
    }
}
