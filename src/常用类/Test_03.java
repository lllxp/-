package 常用类;
public class Test_03 {
	public static void main(String[] args) {
		//包装类与基本数据类型之间转换
		//int
		Integer i = Integer.valueOf(38);//自动装箱
		int i0 = i.intValue();
        System.out.println("包装类i的值为："+i);
        System.out.println("整型i0的值为："+i0);
        System.out.println();
        //double
      	Double j = Double.valueOf(3.14);
      	double j0 = j.doubleValue();
        System.out.println("包装类j的值为："+j);
        System.out.println("浮点型型j0的值为："+j0);
        System.out.println();
        //boolean
        Boolean k = Boolean.valueOf(true);
        boolean k0 = k.booleanValue();
        System.out.println("包装类k的值为："+k);
        System.out.println("布尔k0的值为："+!k0);
        System.out.println();
        //字符型
        Character c = Character.valueOf('a');
        char c0 = c.charValue();
        System.out.println("包装类c的值为："+c);
        System.out.println("字符c0的值为："+c0);
        System.out.println();    
        //包装类与字符串相互转换
        int S = Integer.parseInt("38");
        String S0 = i.toString();
        System.out.println("包装类S的值为："+S);
        System.out.println("字符串型S0的值为："+S0);
        System.out.println(); 
        //基本数据类型与字符串之间相互转换
        int i2 = Integer.parseInt("456");
        String str0 = i2 + "";
        System.out.println("整型i2的值为："+i2);
        System.out.println("字符串型str0的值为："+str0);
	}

}
