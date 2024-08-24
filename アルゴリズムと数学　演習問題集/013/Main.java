import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 入力された整数
        long N = sc.nextLong();
        // rootN: Nの平方根
        double rootN = Math.sqrt(N);
        // NN: 端数を除去
        long NN = (long) rootN;

        // 1からNの平方根までの数でNが割り切れるか計算
        // ⚪︎ * △ をすることで二つ取り出せる
        for (long i = 1; i <= NN; i++) {
            if (N % i == 0) {
                if (N / i != i) {
                    System.out.println(i);
                    System.out.println(N / i);
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
