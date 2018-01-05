package test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.junit.Test;

public class NetTest {
	@Test
	public void test01() throws Exception{
		InetAddress lh=InetAddress.getLocalHost();
		System.out.println(lh);
		
		InetAddress byName=InetAddress.getByName("www.baidu.com");
		System.out.println(byName);
	}
	
	@Test
	public void test02() throws Exception{
		Scanner scan=new Scanner(System.in);
		DatagramSocket socket=new DatagramSocket();
		while(true){
			String msg=scan.nextLine();
			DatagramPacket pack=new DatagramPacket(msg.getBytes(),0 , msg.getBytes().length, InetAddress.getByName("192.168.6.81"),7758);
			socket.send(pack);
			if(msg.equals('0')){
				socket.close();
				scan.close();
			}
		}
	}
	
	@Test
	public void test03() throws Exception{
		DatagramSocket socket=new DatagramSocket(12001);
		byte[] context=new byte[1024];
		DatagramPacket re=new DatagramPacket(context,context.length);
		while(true){
			socket.receive(re);
			String msg=new String(context,0,re.getLength());
			System.out.println(msg);
			if(msg.equals('0')){
				socket.close();
			}
		}
		
	}
	
	
}
