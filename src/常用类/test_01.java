package ������;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_01 {
	private static String str="this is a test of java";
	private static StringBuffer strb=new StringBuffer(str);
	//ͳ�Ƹ��ַ�������ĸs���ֵĴ���
	public int CountS() {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='s')
				count++;
		}
		return count;
	}
	//���ַ�����ÿ�����ʵĵ�һ����ĸ��ɴ�д
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
	//�����ַ�ʽʵ�ָ��ַ����ĵ������
	//StringBuffer����
	public StringBuffer ReseverSB() {
		return strb.reverse();
	}
	//ѭ������
	public String ReseverFor() {
		String temp="";
		for(int i=0;i<str.length();i++) {
			temp+=str.charAt(str.length()-1-i);
		}
		return temp;
	}
	//�����ַ���ת����һ���ַ�������
	public String[] Change() {
		String[] strs=str.split(" ");
		return strs;
	}
	public static void main(String[] args) {
		test_01 t=new test_01();
		System.out.println("��ĸs���ֵĴ���Ϊ��"+t.CountS()+"��");
		System.out.println(str.substring(10,14));//ȡ�����ַ���"test"
		System.out.println(str.toCharArray());//�����ַ������Ƶ�һ���ַ�����Char[]
		System.out.println(t.FirstUp());
		System.out.println(t.ReseverSB());
		System.out.println(t.ReseverFor());
		String[] s=t.Change();
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
