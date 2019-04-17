package 常用类;
public class Test_02 {
	public static void main(String[] args) {
		// String 转 StringBuffer
		String s = "abc";
        StringBuffer sb = new StringBuffer(s);
        //  StringBuffer 转 String
        StringBuffer sb1=new StringBuffer(s);
		String s2=sb1.toString();    
        // 添加操作
        sb1.append("defg");
        System.out.println("添加完结果为：" + sb1.toString());      
        // 插入操作
        sb1.insert(7, "h");
        System.out.println("插入完结果为：" + sb1.toString());
        // 删除操作
        sb1.delete(0, 1);
        System.out.println("删除完结果为：" + sb1.toString());
        
        // 反转操作
        sb1.reverse();
        System.out.println("反转完结果为：" + sb1.toString());
	}

}