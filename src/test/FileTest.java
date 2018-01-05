package test;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

import org.junit.Test;

public class FileTest {
	
	
	
	@Test
	public void test01(){
		File file=new File("D:\\eclipse\\eclipse");
		fileList2(file);
	}
	int i=0;
	public void fileList(File file){
		File[] files=file.listFiles();
		for (File file2 : files) {
			if(file2.isDirectory()){
				fileList(file2);
			}else{
				if(file2.getName().toUpperCase().endsWith(".JAR")){
					System.out.println(i++);
					System.out.println(file2.getName());
				}
			}
		}
	}
	
	
	public void fileList2(File file){
		File[] files=file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				if(file.isDirectory()){
					return true;
				}
				if(file.getName().toUpperCase().endsWith(".JAR")){
					System.out.println(file.getName());
				}
				return false;
			}
		});
		for(File file3:files){
			fileList(file3);
		}
	}
}
