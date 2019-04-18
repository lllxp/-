package 常用类;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Test_04 {
	
	 //检查一个电话号码是否符合(0000)0000-0000
	 public static void NumberTest(String phone) {
	        Pattern b = Pattern.compile("\\(\\d{4}\\)(\\d{4})-(\\d{4})");
	        Matcher p = b.matcher(phone);

	        if (p.matches())
	            System.out.println("电话号码："+phone + "符合(0000)0000-0000");
	        else
	            System.out.println("电话号码："+phone + "不符合(0000)0000-0000");
	    }
	 //将一个字符串中所有的ip地址打印出来
	 public void PrintIp() {
			Pattern p=Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");
			String ip=" 110.120.38.0";
			Matcher m=p.matcher(ip);
			if(m.find()) {
				System.out.println("ip:"+ip.substring(m.start(),m.end()));
				}
			}
	//将字符串中连续出现的字符压缩成一个
	 public static void Compress(String str){
			String newStr = str.replaceAll("(.)(\\1)*", "$1");
			System.out.println("字符串压缩：" + newStr);
		}
	 //输入一个字符串，判断该字符串是否以abc结尾。
	 public static void end(String str) {
		 Pattern p = Pattern.compile("abc$");
			Matcher m = p.matcher(str);
			if(m.find())
				System.out.println("字符串"+str + "是以abc结尾的字符串！");
			else
				System.out.println("字符串"+str + "不是以abc结尾的字符串！");
	 }
	 //将一个字符串中的所有整数提取出来，保存在一维数组中。比如”ae256dd—w348e6”，提取出256,348,6三个整数
	 public void PickUp() {
		 String s="ae256dd—w348e6";
		 String[] num=new String[3];
		 Pattern p=Pattern.compile("\\d+");
		 Matcher m=p.matcher(s);
		 int i=0;
		 while(m.find()) {
		 num[i]=m.group();
		 i++;
		 }
		 for(int j=0;j<i;j++) {
		 System.out.println(num[j]+",");
		 }
		 }
	 //文本替换：将字符串中所有的”pupel”替换为”pupil”。
	 public static void Replace(String str){
		 String str1 = "pupel";
		 String str2 = "pupil";
		 Pattern p = Pattern.compile(str1);
		 Matcher m = p.matcher(str);
		 String newStr = m.replaceAll(str2);
		 System.out.println(str + " 替换后结果为：" + newStr);
	 }
	 //从一个字符串中提取以%cxll=开头，右部是%的字符串（不包含%）。
	 public static void PkCxll(String str){
			Pattern p = Pattern.compile("%CXLL=.*?(?=%)");
			Matcher m = p.matcher(str);
			System.out.println("提取的字符串：");
			while(m.find())
				System.out.println(m.group());
	 }
	 
	 
	public static void main(String[] args) {
		System.out.println("第一题：");
		NumberTest("(3344)1314-1111");
    	NumberTest("1234-5678-9012");
    	
    	System.out.println("第二题：");
    	Test_04 t=new Test_04();
		t.PrintIp();
		
		System.out.println("第三题：");
		Compress("aaabbbccccd");
		
		System.out.println("第六题：");
		end("abcabcabc");
		
		System.out.println("第八题：");
		t.PickUp();
		System.out.println();
		
		System.out.println("第九题：");
		Replace("pupel，pupel，pupel");
		
		System.out.println("第十题：");
		PkCxll("%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11");
	}
}