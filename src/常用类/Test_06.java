package ������;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Test_06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random a = new Random();
        System.out.println("������ʮ�������Ϊ : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = a.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] copyNum = new int[10];
        System.arraycopy(arr, 0, copyNum, 0, copyNum.length);

        System.out.println("���������(4�ַ���) :");
        for (int i = 0; i < 10; i++) {
            System.out.print(copyNum[i] + " ");
        }
        System.out.println();

        System.out.println("������: ");
        Arrays.sort(copyNum);
        for (int i = 0; i < 10; i++) {
            System.out.print(copyNum[i] + " ");
        }
        System.out.println();
        System.out.print("��ѯλ�õ���ֵΪ��");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int index = Arrays.binarySearch(arr, inputNum);
        System.out.println();
        if (index >= 0)
            System.out.println(inputNum + "��λ���ڵ�" + index+"��");
        else
            System.out.println("�Ҳ���" + inputNum);
    }
}