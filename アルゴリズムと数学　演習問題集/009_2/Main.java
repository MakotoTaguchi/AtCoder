import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 数列の要素数、S: 目標の合計値
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];

        // 数列の入力
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Cテーブルを初期化
        boolean[][] C = new boolean[N + 1][S + 1];
        C[0][0] = true;

        // C[0][j] を初期化
        for (int j = 1; j <= S; j++) {
            C[0][j] = false;
        }

        // 動的計画法の処理
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= S; j++) {
                if (j < A[i - 1]) {
                    C[i][j] = C[i - 1][j];
                } else {
                    C[i][j] = C[i - 1][j - A[i - 1]] || C[i - 1][j];
                }
            }
        }

        // 結果を出力
        if (C[N][S]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
