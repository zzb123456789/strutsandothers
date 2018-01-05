package test;

public class Task03Con implements  Runnable {
	private Containers con;

	public Task03Con(Containers con) {
		this.con = con;
	}
	@Override
	public void run() {
		while(true){
			if(con.getSize()==0){
				//生产
			}else if(con.getSize()==0){
				//不生产
			}
		}
	}
}

