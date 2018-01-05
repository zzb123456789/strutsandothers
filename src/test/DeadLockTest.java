package test;

public class DeadLockTest {
	public static void main(String[] args) {
		DeadLock dl=new DeadLock();
		Thread th1=new Thread(dl);
		Thread th2=new Thread(dl);
		th1.start();
		th2.start();
	}
}
