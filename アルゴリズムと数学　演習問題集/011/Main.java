import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N: 入力された整数
        int N = sc.nextInt();

        // 2からNまでの素数を探す
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            System.out.println(Math.sqrt(num));
            // 割り切れる場合は素数ではない
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
