import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 入力された整数
        long N = sc.nextLong();

        // 2からNまでの数でNが割り切れるか計算する
        for (long i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
