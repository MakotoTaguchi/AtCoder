import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 数列
        int N = sc.nextInt();

        // 答えを計算するための変数
        BigInteger ans = BigInteger.ONE; // 初期値を1に設定

        // 1からNまでの数をかけ算する
        for (int i = 1; i <= N; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        // 結果を出力
        System.out.println(ans);

        sc.close();
    }
}
