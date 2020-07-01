import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要打印的斐波那契数列的个数：");
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(fibonacci(i) + "\t");
        }
    }

    public static int fibonacci(int n) {
        if (1 == n || 2 == n) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
