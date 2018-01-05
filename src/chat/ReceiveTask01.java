package chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveTask01 implements Runnable{

	@Override
	public void run() {
		DatagramSocket ds=null;
		try {
			ds = new DatagramSocket(10000);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] text=new byte[1024];
		DatagramPacket dp=new DatagramPacket(text,text.length);
		while(true){
			try {
				ds.receive(dp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String msg=new String(text);
			System.out.println(msg);
			if(msg.equals("0")){
				ds.close();
			}
		}
	}
		
	}


