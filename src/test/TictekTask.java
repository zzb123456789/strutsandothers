package test;

public class TictekTask implements Runnable{
	private int  num=600;
	@Override
	public void run() {
		//未同步有问题
		/*synchronized (this) {
			while(num>0){
				System.out.println(Thread.currentThread().getName()+"卖了第"+num+"张票");
				num--;
			}
		}*/
		//同步加在判断前面保证进入if方法中的只有一个线程--------同步代码块
		/*while(true){
			
			synchronized (this) {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"卖了第"+--num+"张票");
				}else{
					break;
				}
			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		while(true){
			if(num<=0){
				break;
			}
			sell();
			
		}
	}
	public synchronized void sell(){
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"卖了第"+num--+"张票");
		}
	}

}
