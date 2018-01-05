package test;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread  mt=new MyThread();
		mt.start();
		Thread.sleep(130);
		for(int i=0;i<1000;i++){
			System.out.println("===================");
		}
	}
}
