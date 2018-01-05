package chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class SendTask01 implements Runnable {
	@Override
	public void run() {
		DatagramSocket ds=null;
		try {
			ds = new DatagramSocket();
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true){
			Scanner  scan=new Scanner(System.in);
			String msg=scan.nextLine();
			try {
				DatagramPacket dp=new DatagramPacket(msg.getBytes(), 0,msg.getBytes().length, InetAddress.getByName("192.168.6.81"), 9999);
				ds.send(dp);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(msg.equals("0")){
				ds.close();
				scan.close();
			}
		}
	}
		
}		
