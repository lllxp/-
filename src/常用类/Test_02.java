package ������;
public class Test_02 {
	public static void main(String[] args) {
		// String ת StringBuffer
		String s = "abc";
        StringBuffer sb = new StringBuffer(s);
        //  StringBuffer ת String
        StringBuffer sb1=new StringBuffer(s);
		String s2=sb1.toString();    
        // ��Ӳ���
        sb1.append("defg");
        System.out.println("�������Ϊ��" + sb1.toString());      
        // �������
        sb1.insert(7, "h");
        System.out.println("��������Ϊ��" + sb1.toString());
        // ɾ������
        sb1.delete(0, 1);
        System.out.println("ɾ������Ϊ��" + sb1.toString());
        
        // ��ת����
        sb1.reverse();
        System.out.println("��ת����Ϊ��" + sb1.toString());
	}

}