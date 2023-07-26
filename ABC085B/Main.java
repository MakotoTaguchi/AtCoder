import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 枚数の入力
        int N = sc.nextInt();
        // 大きさを入れる配列
        int[] mochi = new int[N];

        for (int i = 0; i <= N - 1; i++) {
            mochi[i] = sc.nextInt();
        }

        int[] result = Arrays.stream(mochi).distinct().toArray();
        System.out.println(result.length);
    }
}
