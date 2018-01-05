package chat;

public class A {
	public static void main(String[] args) {
		SendTask01 st=new SendTask01();
		ReceiveTask01 rt=new ReceiveTask01();
		Thread send=new Thread(st);
		Thread receive=new Thread(rt);
		send.start();
		receive.start();
	}
}
