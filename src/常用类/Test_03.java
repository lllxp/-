package ������;
public class Test_03 {
	public static void main(String[] args) {
		//��װ���������������֮��ת��
		//int
		Integer i = Integer.valueOf(38);//�Զ�װ��
		int i0 = i.intValue();
        System.out.println("��װ��i��ֵΪ��"+i);
        System.out.println("����i0��ֵΪ��"+i0);
        System.out.println();
        //double
      	Double j = Double.valueOf(3.14);
      	double j0 = j.doubleValue();
        System.out.println("��װ��j��ֵΪ��"+j);
        System.out.println("��������j0��ֵΪ��"+j0);
        System.out.println();
        //boolean
        Boolean k = Boolean.valueOf(true);
        boolean k0 = k.booleanValue();
        System.out.println("��װ��k��ֵΪ��"+k);
        System.out.println("����k0��ֵΪ��"+!k0);
        System.out.println();
        //�ַ���
        Character c = Character.valueOf('a');
        char c0 = c.charValue();
        System.out.println("��װ��c��ֵΪ��"+c);
        System.out.println("�ַ�c0��ֵΪ��"+c0);
        System.out.println();    
        //��װ�����ַ����໥ת��
        int S = Integer.parseInt("38");
        String S0 = i.toString();
        System.out.println("��װ��S��ֵΪ��"+S);
        System.out.println("�ַ�����S0��ֵΪ��"+S0);
        System.out.println(); 
        //���������������ַ���֮���໥ת��
        int i2 = Integer.parseInt("456");
        String str0 = i2 + "";
        System.out.println("����i2��ֵΪ��"+i2);
        System.out.println("�ַ�����str0��ֵΪ��"+str0);
	}

}
