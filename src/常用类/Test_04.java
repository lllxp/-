package ������;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Test_04 {
	
	 //���һ���绰�����Ƿ����(0000)0000-0000
	 public static void NumberTest(String phone) {
	        Pattern b = Pattern.compile("\\(\\d{4}\\)(\\d{4})-(\\d{4})");
	        Matcher p = b.matcher(phone);

	        if (p.matches())
	            System.out.println("�绰���룺"+phone + "����(0000)0000-0000");
	        else
	            System.out.println("�绰���룺"+phone + "������(0000)0000-0000");
	    }
	 //��һ���ַ��������е�ip��ַ��ӡ����
	 public void PrintIp() {
			Pattern p=Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");
			String ip=" 110.120.38.0";
			Matcher m=p.matcher(ip);
			if(m.find()) {
				System.out.println("ip:"+ip.substring(m.start(),m.end()));
				}
			}
	//���ַ������������ֵ��ַ�ѹ����һ��
	 public static void Compress(String str){
			String newStr = str.replaceAll("(.)(\\1)*", "$1");
			System.out.println("�ַ���ѹ����" + newStr);
		}
	 //����һ���ַ������жϸ��ַ����Ƿ���abc��β��
	 public static void end(String str) {
		 Pattern p = Pattern.compile("abc$");
			Matcher m = p.matcher(str);
			if(m.find())
				System.out.println("�ַ���"+str + "����abc��β���ַ�����");
			else
				System.out.println("�ַ���"+str + "������abc��β���ַ�����");
	 }
	 //��һ���ַ����е�����������ȡ������������һά�����С����硱ae256dd��w348e6������ȡ��256,348,6��������
	 public void PickUp() {
		 String s="ae256dd��w348e6";
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
	 //�ı��滻�����ַ��������еġ�pupel���滻Ϊ��pupil����
	 public static void Replace(String str){
		 String str1 = "pupel";
		 String str2 = "pupil";
		 Pattern p = Pattern.compile(str1);
		 Matcher m = p.matcher(str);
		 String newStr = m.replaceAll(str2);
		 System.out.println(str + " �滻����Ϊ��" + newStr);
	 }
	 //��һ���ַ�������ȡ��%cxll=��ͷ���Ҳ���%���ַ�����������%����
	 public static void PkCxll(String str){
			Pattern p = Pattern.compile("%CXLL=.*?(?=%)");
			Matcher m = p.matcher(str);
			System.out.println("��ȡ���ַ�����");
			while(m.find())
				System.out.println(m.group());
	 }
	 
	 
	public static void main(String[] args) {
		System.out.println("��һ�⣺");
		NumberTest("(3344)1314-1111");
    	NumberTest("1234-5678-9012");
    	
    	System.out.println("�ڶ��⣺");
    	Test_04 t=new Test_04();
		t.PrintIp();
		
		System.out.println("�����⣺");
		Compress("aaabbbccccd");
		
		System.out.println("�����⣺");
		end("abcabcabc");
		
		System.out.println("�ڰ��⣺");
		t.PickUp();
		System.out.println();
		
		System.out.println("�ھ��⣺");
		Replace("pupel��pupel��pupel");
		
		System.out.println("��ʮ�⣺");
		PkCxll("%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11");
	}
}