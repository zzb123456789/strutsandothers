package test;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TaskComptTest {
	public static void main(String[] args) throws Exception {
		ExecutorService pool=Executors.newFixedThreadPool(5);
		//（1）Future的get方法在获取结果时候将进入   阻塞，阻塞直到Callable中的call返回。
		//（2）如果不想使得get阻塞，那么可以在get之前加一层判断isDone()，如果完成就获取，如果没有则跳过。
			for(int i=1;i<=5;i++){
				Future<Integer> f=pool.submit(new TaskCompt(i*100));
				//if(f.isDone()){
					System.out.println("****************************"+f.get());
				//}
		}
		
		
		
	}
}
