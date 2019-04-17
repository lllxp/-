package 常用类;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_01 {
	private static String str="this is a test of java";
	private static StringBuffer strb=new StringBuffer(str);
	//统计该字符串中字母s出现的次数
	public int CountS() {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='s')
				count++;
		}
		return count;
	}
	//将字符串中每个单词的第一个字母变成大写
	public String FirstUp() {
		String temp=str.substring(0,1).toUpperCase();
		temp+=str.substring(1, str.length());
		Pattern p=Pattern.compile("\\s");
		Matcher m=p.matcher(temp);
		while(m.find()) {
			int start=m.start();
			String s=temp.substring(start+1,start+2);
			char c=s.toUpperCase().charAt(0);
			String s1=temp.substring(0,start+1);
			String s2=temp.substring(start+2);
			temp=s1+c+s2;
		}
		return temp;
	}
	//用两种方式实现该字符串的倒序输出
	//StringBuffer方法
	public StringBuffer ReseverSB() {
		return strb.reverse();
	}
	//循环方法
	public String ReseverFor() {
		String temp="";
		for(int i=0;i<str.length();i++) {
			temp+=str.charAt(str.length()-1-i);
		}
		return temp;
	}
	//将本字符串转换成一个字符串数组
	public String[] Change() {
		String[] strs=str.split(" ");
		return strs;
	}
	public static void main(String[] args) {
		test_01 t=new test_01();
		System.out.println("字母s出现的次数为："+t.CountS()+"次");
		System.out.println(str.substring(10,14));//取出子字符串"test"
		System.out.println(str.toCharArray());//将本字符串复制到一个字符数组Char[]
		System.out.println(t.FirstUp());
		System.out.println(t.ReseverSB());
		System.out.println(t.ReseverFor());
		String[] s=t.Change();
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
