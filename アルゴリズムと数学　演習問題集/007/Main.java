import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力された整数
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 倍数の個数
        int count = 0;

        // 入力した個数分繰り返す
        for (int i = 1; i <= n; i++) {
            if (i % x == 0) {
                count++;
            } else if (i % y == 0) {
                count++;
            }
        }
        // 出力
        System.out.println(count);
    }
}