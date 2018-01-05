package test;

import java.util.ArrayList;

import org.junit.Test;

public class Containers extends ArrayList<Object>{
	private int size=5;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Object   get(){
		return this.remove(this.size()-1);
	}
	 void set(Object obj){
		this.add(0, obj);
	}
}
