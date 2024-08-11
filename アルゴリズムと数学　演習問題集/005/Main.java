import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 整数の個数を受け取る
        int count = sc.nextInt();

        // 合計を代入する変数
        int sum = 0;

        // 入力した個数分繰り返す
        for (int i = 0; i < count; i++) {
            // 配列に入れた数字をキャストして受け取る
            int number = sc.nextInt();
            // numbersに受け取った数字をsumに足していく
            sum += number;
        }

        // 出力
        System.out.println(sum % 100);
    }
}