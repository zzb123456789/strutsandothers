package test;

public class TicketDemo {
	public static void main(String[] args) {
		TictekTask task=new TictekTask();
		Thread th1=new Thread(task,"th1");
		Thread th2=new Thread(task,"th2");
		Thread th3=new Thread(task,"th3");
		th1.start();
		th2.start();
		th3.start();
	}
}
