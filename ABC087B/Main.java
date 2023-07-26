import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 500円玉の枚数
        int coin_500 = sc.nextInt();
        // 100円玉の枚数
        int coin_100 = sc.nextInt();
        // 50円玉の枚数
        int coin_50 = sc.nextInt();
        // 合計金額
        int coin_sum = sc.nextInt();
        // 何通りかを数える
        int count = 0;
        // 合計金額を計算
        int sum = 0;

        for (int i = 0; i <= coin_50; i++) {
            for (int j = 0; j <= coin_100; j++) {
                for (int k = 0; k <= coin_500; k++) {
                    sum = 50 * i + 100 * j + 500 * k;
                    if (sum == coin_sum) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
