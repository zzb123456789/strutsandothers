package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class MapIte {
	@Test
	public void test01(){
		Map<String,String> map=new HashMap<>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println(entry.getKey()+"==="+entry.getValue());
		}
		
		for(String key:map.keySet()){
			System.out.println(key+"=="+map.get(key));
		}
		
		Iterator<Map.Entry<String,String>> i=map.entrySet().iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		for(String val:map.values()){
			System.out.println(val);
		}
		
	}
}
