package test;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class DownLoad {
	public static String getHtml() throws Exception{
		/*URL url= new URL("https://desk.zol.com.cn/meinv/");*/
		URL url= new URL("https://list.jd.com/list.html?cat=1620,1621,1627");
		InputStream input=url.openStream();
		BufferedReader bfr=new BufferedReader(new InputStreamReader(input, "gbk"));
		StringBuilder sb=new StringBuilder();
		String len=null;
		while((len=bfr.readLine())!=null){
			sb.append(len);
		}
		bfr.close();
		return sb.toString();
	}
	
	public static Map<String,String > getUrl(String html){
		String img="<img[\\s\\S]{10,200}alt=\"([^\"]{1,50})\"\\ssrc=\"([^\"]{1,200})";
		Matcher ma=Pattern.compile(img).matcher(html);
		Map<String,String> map=new HashMap<>();
		while(ma.find()){
		
			map.put(ma.group(1), ma.group(2));
		}
		return map;
		
	}
	
	public static void downOne(String alt,String url) throws Exception, IOException{
		InputStream is=new URL(url).openStream();
		String outPath="d:/picture/";
		OutputStream os=new FileOutputStream(outPath+alt+url.substring(url.length()-4));
		int len;
		byte[] b=new byte[1024];
		while((len=is.read(b))!=-1){
			os.write(b, 0, len);
		}
		is.close();
		os.close();
	}
	
	public static void download(Map<String ,String> map) throws IOException, Exception{
		Set<Map.Entry<String,String>> set=map.entrySet();
		for (Entry<String, String> entry : set) {
			String alt=entry.getKey();
			String url=entry.getValue();
			downOne(alt,url);
		}
	}
	@Test
	public void test() throws IOException, Exception{
		String html=getHtml();
		Map<String,String> src=getUrl(html);
		download(src);
	}
	
}
