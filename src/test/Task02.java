package test;

public class Task02 implements  Runnable {
	 private User user;
	 
	public Task02(User user) {
		this.user = user;
	}

	@Override
	public void run() {
		while(true){
			
				synchronized (user) {
					System.out.println("消费者拿到锁");
					if(!user.isFlag()){
						try {
							System.out.println("消费者wait()");
							user.wait();
							System.out.println("消费者被唤醒");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("消费者消费");
					System.out.println(user);
					user.setFlag(false);
					user.notify();
				}
		}
	}

}
