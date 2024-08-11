import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力された整数
        int n = sc.nextInt();
        int s = sc.nextInt();

        // カードの配列
        int[] card = new int[n];

        // カードを配列に入れていく
        for (int i = 0; i < n; i++) {
            card[i] = sc.nextInt();
            System.out.println(card[i]);
        }

        // 部分和を確認するためのDP配列
        boolean[] dp = new boolean[s + 1];
        // 合計0はカードを選ばないことで達成可能
        dp[0] = true;

        // カードを使って部分和を作れるかを判定
        for (int i = 0; i < n; i++) {
            for (int j = s; j >= card[i]; j--) {
                dp[j] = dp[j] || dp[j - card[i]];
            }
        }

        // 出力
        System.out.println(dp[s] ? "YES" : "NO");
    }
}