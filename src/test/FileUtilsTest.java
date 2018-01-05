package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

public class FileUtilsTest {
	@Test
	public void test01(){
		//FileNameUtils  
		String strName=FilenameUtils.getName("D:/aaa.txt");
		System.out.println("文件名："+strName);
		String exName=FilenameUtils.getExtension("D:/aaa.txt");
		System.out.println("扩展名："+exName);
		boolean isTxt=FilenameUtils.isExtension("D:/aaa.txt", "txt");
		System.out.println("后缀名是否是txt："+isTxt);
	}
	
	@Test
	public void test02() throws IOException{
		//FileUtils 
		//读文件到string
		String text=FileUtils.readFileToString(new File("D:/三国/三国之 ﻿三国演义 上卷.txt"), "utf-8");
		System.out.println(text);
		//将String写到文件
		FileUtils.writeStringToFile(new File("D:/text.txt"), text);
		//拷贝文件夹
		FileUtils.copyDirectory(new File("D:/三国"), new File("D:/三国演义"));
		//拷贝文件
		FileUtils.copyFile(new File("D:/三国/三国之 ﻿三国演义 上卷.txt"), new File("E:/sanguo.txt"));
	}
}
