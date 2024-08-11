import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力された整数
        int n = sc.nextInt();
        int s = sc.nextInt();

        // 倍数の個数
        int count = 0;

        // S以下になる個数を計算
        for (int i = 1; i <= n; i++) {
            // 最大値を超えたらブレイク
            if (i > s) {
                break;
            }
            for (int j = 1; j <= n; j++) {
                // 最大値を超えたらブレイク
                if (j > s) {
                    break;
                }

                if (i + j <= s) {
                    count++;
                }
            }
        }
        // 出力
        System.out.println(count);
    }
}