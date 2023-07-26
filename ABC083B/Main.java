import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 最大値入力
        int max = sc.nextInt();
        // 各桁の和の制約
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 総和
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            int num_sum = 0;
            int len = String.valueOf(i).length();

            for (int j = 1; j <= len; j++) {
                num_sum += (i / Math.pow(10, j - 1) % 10);
            }

            if (a <= num_sum && num_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
