package chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Send {
	
	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket();
		while(true){
			Scanner  scan=new Scanner(System.in);
			String msg=scan.nextLine();
			DatagramPacket dp=new DatagramPacket(msg.getBytes(), 0,msg.getBytes().length, InetAddress.getByName("192.168.6.163"), 9999);
			ds.send(dp);
			if(msg.equals("0")){
				ds.close();
				scan.close();
			}
		}
	}
}
