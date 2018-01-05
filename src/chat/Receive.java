package chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket(9999);
		byte[] text=new byte[1024];
		DatagramPacket dp=new DatagramPacket(text,text.length);
		while(true){
			ds.receive(dp);
			String msg=new String(text);
			System.out.println(msg);
			if(msg.equals("0")){
				ds.close();
			}
		}
		
		
	}
}
