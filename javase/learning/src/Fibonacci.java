import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要打印的斐波那契数列的个数：");
        int count = sc.nextInt();
        int previous = 0;
        int next = 0;
        int result = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(result + "\t");
            previous = next;
            next = result;
            result = previous + next;
        }
    }
}
