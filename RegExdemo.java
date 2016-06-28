package org.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExdemo {

	public static void main(String[] args)
	{
		/*String regex="\\bdog\\b";
		String target="Before Java 1.5 was 1.4 and after Java 1.5 is Java 1.6"*/;
	//	System.out.println(target.replaceAll("1.5", "5"));
	//	System.out.println(target.replaceAll("1.6", "6"));
		//String arr[]=target.split("//");
//		Matcher matcher=Pattern.compile(regex).matcher(target);
//		
//		while(matcher.find())
//		{
//			System.out.println("group is" + matcher.group());
//			System.out.println("start is" + matcher.start());
//			System.out.println("end is" + matcher.end());
//		}
		
		
	/*String regex1="\\bJava\\s+1\\.([56])\\b";
	Matcher m= Pattern.compile(regex1).matcher(target);
	String result =m.replaceAll("Java $1");
	System.out.println(result);*/
	
	String xml="<data  id=\"245892769\" objName=\"USER\"><Msg>21 fields have been processed.</Msg></data></resp>";
	String regex1="<data  id=\"245892769\" objName=\"USER\"><Msg>21 fields have been processed.</Msg></data></resp>";
	Matcher m= Pattern.compile(regex1).matcher(xml);
	System.out.println(m.group());

	}
}
