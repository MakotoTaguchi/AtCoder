import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力された整数
        int n = sc.nextInt();

        // 合計
        int sum = n * 2 + 3;

        // 出力
        System.out.println(sum);
    }
}