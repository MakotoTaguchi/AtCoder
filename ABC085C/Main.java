import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 枚数の入力
        int number = sc.nextInt();
        // 合計金額
        int total = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number - i; j++) {
                int k = number - i - j;
                int sum = i * 10000 + j * 5000 + k * 1000;
                if (sum == total) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");

    }
}
