package test;

public class DeadLock implements Runnable{
	Object a=new Object();
	Object b=new Object();
	int num=0;
	@Override
	public void run() {
		while(true){
			num++;
			if(num%2==0){
				synchronized (a) {
					System.out.println("aaa");
					synchronized (b) {
						System.out.println("bbb");
					}
				}
			}else{
				synchronized (b) {
					System.out.println("cccc");
					synchronized (a) {
						System.out.println("dddd");
					}
				}
			}
		
			
		
		}
	}
}
