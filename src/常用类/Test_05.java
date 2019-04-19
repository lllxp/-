package 常用类;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Test_05 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("输入日期(yyyy-MM-dd)：");
		String Date = input.next();
		input.close();
		int year = Integer.valueOf(Date.substring(0, 4));
		int month = Integer.valueOf(Date.substring(5, 7));
		int dayOfMonth = Integer.valueOf(Date.substring(8));
		LocalDate localDate = LocalDate.of(year, month, dayOfMonth);
		System.out.println("推迟后的时间为：");//原日期推迟7天
		System.out.println(localDate.plusDays(7).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		
		//使用java8的日期时间包获取当前系统时间，并以各种格式加以显示
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("短的日期时间格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT)));
		System.out.println("中等的日期时间格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
		System.out.println("长的日期时间格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
		System.out.println("完整的日期格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
		System.out.println("完整的日期时间格式：" + localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.LONG)));
		
		//使用java8的日期时间包获取当前系统时间，并修改这个时间（分别修改年份、月份、天、小时）
		System.out.println("修改年份：" + localDateTime.plusYears(3));
		System.out.println("修改月份：" + localDateTime.plusMonths(2));
		System.out.println("修改天数：" + localDateTime.plusDays(3));
		System.out.println("修改小时：" + localDateTime.plusHours(6));

	}
}
