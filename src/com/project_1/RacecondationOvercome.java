package com.project_1;

class ClassRoom{
synchronized void takingclass(int num) {
		for(int i=0;i<=5;i++) {
			System.out.println(num * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Teacherone extends Thread{
	ClassRoom classroom;
	public Teacherone(ClassRoom classroom) {
		this.classroom=classroom;
	}
	public void run() {
		super.run();
		classroom.takingclass(5);
	}
}
class Teachertwo extends Thread{
	ClassRoom classroom;
	public Teachertwo(ClassRoom classroom) {
		this.classroom=classroom;
	}
	public void run() {
		super.run();
		classroom.takingclass(100);
	}
}
public class RacecondationOvercome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var classroom=new ClassRoom();

		var t1 = new Teacherone(classroom);
        var t2 = new Teachertwo(classroom);
       
        t1.start();
        t2.start();
        try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
