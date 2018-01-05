package chat;

public class B {
	public static void main(String[] args) {
		SendTask02 st=new SendTask02();
		ReceiveTask02 rt=new ReceiveTask02();
		Thread send=new Thread(st);
		Thread receive=new Thread(rt);
		send.start();
		receive.start();
	}
}
