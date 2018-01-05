package test;

public class PCThreadTest {
	public static void main(String[] args) {
		//生产者消费者模式，只能生产两种类型
		/*User user=new User();
		Task01 p=new Task01(user);
		Task02 c=new Task02(user);
		Thread write=new Thread(p);
		Thread print=new Thread(c);
		write.start();
		print.start();*/
		
		//生产多种
		Containers con=new Containers();
		Task03Con p=new Task03Con(con);
		Task04Con c=new Task04Con(con);
		Thread write=new Thread(p);
		Thread print=new Thread(c);
		write.start();
		print.start();
		
		
	}
}
