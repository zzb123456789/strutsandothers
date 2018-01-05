package test;

public class Car {
	//如果多线程在getCar()加锁，syn..(同步方法)
	
	//懒汉
	/*private static Car car;
	private Car(){
	}
	public static Car getCar(){
		if(car==null){
			return car=new Car();
		}else{
			return car;
		}
	}*/
	//饿汉
	private static Car car=new Car();
	private Car(){
	}
	public static Car getCar(){
			return car;
	}
	
}
