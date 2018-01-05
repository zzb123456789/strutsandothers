package com.zhiyou100.proxytest;

import java.util.ArrayList;

import org.junit.Test;

public class TestONGL extends ArrayList<Object>{
		public void push(Object obj){
			this.add(0, obj);
			//this.add(obj);
		}
		
		public Object pop(){
			return this.remove(0);
		}
		
		
		public void push2(Object obj){
			this.add(obj);
		}
		
		public Object pop2(){
			return this.remove(this.size()-1);
		}
		@Test
		public void tset01(){
			push2(123);
			push2(789);
			push2(456);
			System.out.println(pop2()+"==="+pop2());
		}
}
