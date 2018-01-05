package test;

public class Task01 implements  Runnable {
	private User user;
	
	public Task01(User user) {
		this.user = user;
	}

	@Override
	public void run() {
		int num=0;
		while(true){
			
				synchronized (user) {
					System.out.println("生产者拿到锁");
					if(user.isFlag()){
						try {
							System.out.println("生产者拿wait()");
							user.wait();
							System.out.println("生产者被唤醒");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					System.out.println("生产者生产");
					if(num%2==0){
						user.setName("张三");
						user.setAge(13);
						num++;
					}else{
						user.setName("李四");
						user.setAge(14);
						num++;
					}
					user.setFlag(true);
					user.notify();
				}
		}
	}
}

