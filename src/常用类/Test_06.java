package 常用类;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Test_06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random a = new Random();
        System.out.println("产生的十个随机数为 : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = a.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] copyNum = new int[10];
        System.arraycopy(arr, 0, copyNum, 0, copyNum.length);

        System.out.println("复制随机数(4种方法) :");
        for (int i = 0; i < 10; i++) {
            System.out.print(copyNum[i] + " ");
        }
        System.out.println();

        System.out.println("排序结果: ");
        Arrays.sort(copyNum);
        for (int i = 0; i < 10; i++) {
            System.out.print(copyNum[i] + " ");
        }
        System.out.println();
        System.out.print("查询位置的数值为：");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int index = Arrays.binarySearch(arr, inputNum);
        System.out.println();
        if (index >= 0)
            System.out.println(inputNum + "的位置在第" + index+"个");
        else
            System.out.println("找不到" + inputNum);
    }
}