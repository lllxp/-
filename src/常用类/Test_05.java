package ������;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Test_05 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("��������(yyyy-MM-dd)��");
		String Date = input.next();
		input.close();
		int year = Integer.valueOf(Date.substring(0, 4));
		int month = Integer.valueOf(Date.substring(5, 7));
		int dayOfMonth = Integer.valueOf(Date.substring(8));
		LocalDate localDate = LocalDate.of(year, month, dayOfMonth);
		System.out.println("�Ƴٺ��ʱ��Ϊ��");//ԭ�����Ƴ�7��
		System.out.println(localDate.plusDays(7).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		
		//ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���Ը��ָ�ʽ������ʾ
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("�̵�����ʱ���ʽ��" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT)));
		System.out.println("�еȵ�����ʱ���ʽ��" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
		System.out.println("��������ʱ���ʽ��" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
		System.out.println("���������ڸ�ʽ��" + localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		System.out.println("����������ʱ���ʽ��" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.LONG)));
		
		//ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���޸����ʱ�䣨�ֱ��޸���ݡ��·ݡ��졢Сʱ��
		System.out.println("�޸���ݣ�" + localDateTime.plusYears(3));
		System.out.println("�޸��·ݣ�" + localDateTime.plusMonths(2));
		System.out.println("�޸�������" + localDateTime.plusDays(3));
		System.out.println("�޸�Сʱ��" + localDateTime.plusHours(6));

	}
}
