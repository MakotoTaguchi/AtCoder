import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 合計を代入する変数
        int sum = 0;

        // 入力した個数分繰り返す
        for (int i = 0; i < 3; i++) {
            // 配列に入れた数字をキャストして受け取る
            int number = sc.nextInt();

            if (sum == 0) {
                // 最初の1回目は代入のみ
                sum = number;
            } else {
                // numbersに受け取った数字をsumにかけていく
                sum = sum * number;
            }
        }

        // 出力
        System.out.println(sum);
    }
}