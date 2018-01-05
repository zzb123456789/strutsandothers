package test;

import org.junit.Test;

public class Regex {
	@Test 
	public void test(){
		/*String str="123564654";
		String reg="[^0]\\d{4,14}";*/
//		String str="24564654123";
//		String reg="[1][34578]\\d{9,9}";
		
		/*String str="qq5646w4123";
		String reg="[\\d]";*/
		/*String str="2";
		String reg="[1-9]{1,}";*/
		String str="2";
		String reg="[1-9]{1,}";
		System.out.println(str.matches(reg));
	}
}
