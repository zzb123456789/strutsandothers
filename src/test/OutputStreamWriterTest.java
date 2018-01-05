package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.junit.Test;

public class OutputStreamWriterTest {
	@Test
	public void test01() throws IOException{
		
		FileWriter fw=new FileWriter("d:/aaa.txt");
		fw.write("good good sduty,你好!");
		fw.flush();
		fw.close();
	}
	
	@Test
	public void test02() throws IOException{
		FileOutputStream os= new FileOutputStream("d:/aaa.txt");
		OutputStreamWriter  osw=new OutputStreamWriter(os, "utf-8");
		osw.write("good good sduty! 你好哦");
		osw.flush();
		osw.close();
	}
	
	@Test
	public void test03() throws IOException{
		//转换流就是为了解决写入或读取的时候指定编码格式
		FileInputStream fis=new FileInputStream("d:/aaa.txt");
		InputStreamReader isr=new InputStreamReader(fis, "unicode");
		char [] b=new char[3];
		int len=0;
		while((len=isr.read(b))!=-1){
			System.out.print(new String(b,0,len));
		}
	}
	
	
	@Test
	public void test04() throws IOException{
		//使用readLIne() 尽管文件中有换行，str中没有换行符
		BufferedReader br=new BufferedReader(new FileReader("d:/aaa.txt"));
		String str=null;
		while((str=br.readLine())!=null){
			System.out.print(str);
		}
		br.close();
	}
	
	
	@Test
	public void test05() throws IOException{
		//System.out.println();
		FileOutputStream fos=new FileOutputStream("d:/in.txt");
		int len;
		byte[] b=new byte[20];
		while((len=System.in.read(b))!=-1){
			/*fos.write((char)len);*/
			fos.write(b, 0, len);
		}
	}
		@Test
			 public  void Test() throws IOException {
			        for (int j = 0; j < 5; j++) {
			            System.out.println("请输入:");
			            char c = 0;
			            c = (char) System.in.read();
			            if (c == '1') {
			                System.out.println("OK!");
			            } else {
			                System.out.println((int) c);
			            }
			        }
			    }
		
		@Test
		public void test06(){
			Scanner sc = new Scanner(System.in);  
		    try{  
		        System.out.println("名字： ");  
		        String str = sc.next();  
		        System.out.println("用户输入" + str);  
		    }catch(Exception e){  
		        e.printStackTrace();  
		    } 
		    sc.close();
		}
}
