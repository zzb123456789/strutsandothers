package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

public class IOFileTest {
	@Test
	public void test01() throws Exception{
		FileInputStream fis=new FileInputStream("d:/upload/a.jpg");
		FileOutputStream fos=new FileOutputStream("d:/b.jpg");
		byte [] b=new byte[1024];
		int a ;
		while((a=fis.read(b))!=-1){
				fos.write(b, 0, a);
		}
	}
	
	
	@Test
	public void test02() throws Exception{
		FileInputStream fis=new FileInputStream("d:/c.txt");
		FileOutputStream fos=new FileOutputStream("d:/d.txt");
		byte [] b=new byte[3];
		int a ;
		while((a=fis.read(b))!=-1){
				fos.write(b, 0, a);
			System.out.println(new String(b,0,a));
		}
	}
}
