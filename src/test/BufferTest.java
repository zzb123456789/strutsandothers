package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

import org.junit.Test;

public class BufferTest {
	@Test
	public void Test01() throws IOException{
		FileReader fr=new FileReader("d:/三国演义.txt");
		BufferedReader br=new BufferedReader(fr);
		String str=null;
		BufferedWriter bw=null;
		FileWriter fw=null;
		while((str=br.readLine())!=null){
			//BufferedWriter bw=null;
			if(str.startsWith("第")){
				fw=new FileWriter("d:/三国/三国之 "+str+".txt");
				bw=new BufferedWriter(fw);
				bw.write(str);
				bw.flush();
				System.out.println(str);
			}else if(str.endsWith("上卷")){
				fw=new FileWriter("d:/三国/三国之 "+str+".txt");
				bw=new BufferedWriter(fw);
				bw.write(str);
				bw.flush();
			}
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
