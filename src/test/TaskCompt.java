package test;

import java.util.concurrent.Callable;

public class TaskCompt implements Callable<Integer>{
	private Integer num;
	public TaskCompt(Integer a) {
		this.num=a;
	}

	@Override
	public Integer call() throws Exception {
		//Thread.sleep(2000);
		System.out.println("================");
		//System.out.println((1+num)*num/2);
		return (1+num)*num/2;
	}

}
